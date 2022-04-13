package com.starling.apis;

import java.util.List;
import java.util.UUID;

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

import com.starling.apis.models.SavingsGoal;
import com.starling.apis.models.Spaces;

@Service
public class SavingsGoalAPI {


	@Autowired
	private RestTemplate restTemplate;

	@Value("${starling.sandbox.url}")
	private String sandboxUrl;
	
	@Autowired
	private CommonCall restCall;

	public UUID getGoalSpaces(UUID accountUid) {
		HttpHeaders headers = restCall.restBuilder();
		final HttpEntity<?> httpEntity = new HttpEntity<>(headers);
		UUID savingUID = null;
		try {
			final ResponseEntity<Spaces> response = restTemplate.exchange(sandboxUrl.concat(String.format("/api/v2/account/%s/spaces", accountUid.toString())), HttpMethod.GET, httpEntity,
					Spaces.class);
			if(response.getBody()!=null) {
				List<SavingsGoal> savinggoal = response.getBody().getSavingsGoals();
				for(SavingsGoal save : savinggoal) {
					if(save.getSavedPercentage()!= null && save.getSavedPercentage()<100) {
						return save.getSavingsGoalUid();
					}
				}
				
			}
			

			return savingUID;

		} catch (HttpClientErrorException ex) {
			throw new HttpClientErrorException(HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			throw new HttpClientErrorException(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}




}
