/**
 * 
 */
package com.starling.roundUp.services;

import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.starling.apis.AddMoneyToGoalClient;
import com.starling.apis.FeedsOfAccount;
import com.starling.apis.SavingsGoalAPI;
import com.starling.apis.UserAccount;
import com.starling.apis.models.Account;
import com.starling.apis.models.AddMoneyResponse;
import com.starling.apis.models.Amount;
import com.starling.apis.models.FeedItem;
import com.starling.roundUp.ResponseModel.CommonResponse;
import com.starling.roundUp.requestModel.RoundUpRequestModel;

import io.netty.util.internal.StringUtil;

/**
 * @author LAIJU
 *
 */
@Service
public class RoundUpService {
	
	Logger logger = Logger.getLogger(RoundUpService.class.getName());

	@Autowired
	private UserAccount accounts;

	@Autowired
	private SavingsGoalAPI savingsGoal;

	@Autowired
	FeedsOfAccount transaction;

	@Autowired
	private AddMoneyToGoalClient addMoney;

	/**
	 * The roundUp function Initial Call
	 * 
	 * @param request
	 * @return
	 */
	public ResponseEntity<CommonResponse> roundUp(RoundUpRequestModel request) {
		UUID savingsGoalUid = null;
		logger.info("Entering roundUp..");
		// Check for the savingGoal Id
		if (StringUtil.isNullOrEmpty(request.getSavingGoal().toString())) {
			// fetching savingsGoalUid using AccountUID, if the savingsGoalUid not present in the request
			savingsGoalUid = savingsGoal.getGoalSpaces(request.getAccountUID());
			if (savingsGoalUid == null) {
				return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON)
						.body(new CommonResponse(false, "Unknown Saving Goal"));
			}
		} else {
			savingsGoalUid = request.getSavingGoal();
		}
		//Accessing the account details
		final List<Account> UserAccountList = accounts.getAccounts();
		if (UserAccountList != null && !UserAccountList.isEmpty()) {
			//match the account UID with request UID
			Account account = UserAccountList.stream().filter(x -> request.getAccountUID().equals(x.getAccountUid()))
					.findAny().orElse(null);
			if (account != null) {
				//fetching the transactions using start and end date.
				final List<FeedItem> feedItems = transaction.GetDefaultTransactionalFeeds(account.getAccountUid(),
						account.getDefaultCategory(), request.getMinTimestamp(), request.getMaxTimestamp());
				if (feedItems != null) {
					
					Stream<FeedItem> filteredFeeds = feedItems.stream()
							.filter(feed -> feed.getDirection().equals("OUT"));
					int totalSaving = filteredFeeds
							.collect(Collectors.summingInt(o -> roundUp(o.getAmount().getMinorUnits())));
					Amount amount = new Amount(totalSaving, account.getCurrency());
					//Adding money to the saving space
					final AddMoneyResponse addres = addMoney.addMoneyToSaving(account.getAccountUid(), amount, savingsGoalUid);
					return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(new CommonResponse(addres.getSuccess(), addres.getTransferUid().toString()));
				}
			}
		}
		return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON)
						.body(new CommonResponse(false, "Unknown Account"));

			

	}

	/**
	 * The function to calculate the roundUp
	 * 
	 * @param minorUnits
	 * @return
	 */
	private int roundUp(Integer minorUnits) {
		int pence = 0;
		int roundupDecimal = 0;
		if (minorUnits >= 0) {
			pence = 100 - (minorUnits % 100);
			roundupDecimal = pence != 100 ? pence : 0;
		}
		return roundupDecimal;
	}

}
