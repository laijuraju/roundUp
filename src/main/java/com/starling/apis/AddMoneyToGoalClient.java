/**
 * 
 */
package com.starling.apis;

import java.net.URI;
import java.util.UUID;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.starling.apis.models.AddMoneyResponse;
import com.starling.apis.models.Amount;
import com.starling.apis.models.SavingGoalMoney;

/**
 * @author LAIJU
 *
 */

@Service
public class AddMoneyToGoalClient {
	Logger logger = Logger.getLogger(AddMoneyToGoalClient.class.getName());

	@Autowired
	private RestTemplate restTemplate;

	@Value("${starling.sandbox.url}")
	private String sandboxUrl;

	@Autowired
	private CommonCall restCall;

	/**
	 * adding Money To the Savings - This function will invoke the Strling API - PUT
	 * /api/v2/account/{accountUid}/savings-goals/{savingsGoalUid}/add-money/{transferUid}
	 * 
	 * @param accountUid
	 * @param amount
	 * @param savingsGoalUid
	 * @return
	 */
	public AddMoneyResponse addMoneyToSaving(UUID accountUid, Amount amount, UUID savingsGoalUid) {
		logger.info("invoking saving goal");
		HttpHeaders headers = restCall.restBuilder();
		SavingGoalMoney roundUpAmount = new SavingGoalMoney(amount);
		final HttpEntity<?> httpEntity = new HttpEntity<>(roundUpAmount, headers);

		URI uri = UriComponentsBuilder
				.fromUriString(sandboxUrl.concat(String.format("/api/v2/account/%s/savings-goals/%s/add-money/%s",
						accountUid.toString(), savingsGoalUid.toString(), UUID.randomUUID().toString())))
				.build().toUri();
		try {
			final ResponseEntity<AddMoneyResponse> response = restTemplate.exchange(uri, HttpMethod.PUT, httpEntity,
					AddMoneyResponse.class);
			if (response.getBody() != null) {
				return response.getBody();
			}

		} catch (HttpClientErrorException ex) {
			logger.info("HttpClientErrorException.."+ HttpStatus.INTERNAL_SERVER_ERROR.toString());
			throw new HttpClientErrorException(HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			logger.info("HttpClientErrorException.."+ HttpStatus.INTERNAL_SERVER_ERROR.toString());
			throw new HttpClientErrorException(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return null;

	}

}
