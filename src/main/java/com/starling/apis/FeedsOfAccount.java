/**
 * 
 */
package com.starling.apis;

import java.net.URI;
import java.time.OffsetDateTime;
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
import org.springframework.web.util.UriComponentsBuilder;

import com.starling.apis.models.FeedItem;
import com.starling.apis.models.TransactionFeedResponse;

/**
 * @author LAIJU
 *
 */

@Service
public class FeedsOfAccount {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${starling.sandbox.url}")
	private String sandboxUrl;
	
	@Autowired
	private CommonCall restCall;

	public List<FeedItem> GetDefaultTransactionalFeeds(UUID accountUid, UUID categoryUid, OffsetDateTime MinTimestamp,
			OffsetDateTime MaxTimestamp) {

		HttpHeaders headers = restCall.restBuilder();
		final HttpEntity<?> httpEntity = new HttpEntity<>(headers);
		UUID savingUID = null;
		URI uri = UriComponentsBuilder
				.fromUriString(
						sandboxUrl.concat(String.format("/api/v2/feed/account/%s/category/%s/transactions-between",
								accountUid.toString(), categoryUid.toString())))
				.queryParam("minTransactionTimestamp", MinTimestamp.toString())
				.queryParam("maxTransactionTimestamp", MaxTimestamp.toString()).build().toUri();
		try {
			final ResponseEntity<TransactionFeedResponse> response = restTemplate.exchange(uri, HttpMethod.GET,
					httpEntity, TransactionFeedResponse.class);
			if (response.getBody() != null) {
				return response.getBody().getFeedItems();
			}

		} catch (HttpClientErrorException ex) {
			throw new HttpClientErrorException(HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			throw new HttpClientErrorException(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return null;

	}

}
