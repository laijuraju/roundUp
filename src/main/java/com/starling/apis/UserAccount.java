/**
 * 
 */
package com.starling.apis;

import java.util.List;
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

import com.starling.apis.models.Account;
import com.starling.apis.models.Accounts;

/**
 * @author Laiju
 *
 */
@Service
public class UserAccount {
	Logger logger = Logger.getLogger(UserAccount.class.getName());

	@Autowired
	private RestTemplate restTemplate;

	@Value("${starling.sandbox.url}")
	private String sandboxUrl;

	
	@Autowired
	private CommonCall restCall;
	/**
	 * Fetching details of accounts using Starling API -/api/v2/accounts
	 * @return List of Accounts
	 */
	public List<Account> getAccounts() {
		logger.info("Accessing user account...");
		HttpHeaders headers = restCall.restBuilder();
		final HttpEntity<?> httpEntity = new HttpEntity<>(headers);

		try {
			final ResponseEntity<Accounts> response = restTemplate.exchange(sandboxUrl.concat("/api/v2/accounts"),
					HttpMethod.GET, httpEntity, Accounts.class);
			if (response.getBody() != null) {
				return response.getBody().getAccounts();
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
