/**
 * 
 */
package com.starling.apis;

import java.time.Duration;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author LAIJU
 *
 */

@Service
public class CommonCall {
	Logger logger = Logger.getLogger(CommonCall.class.getName());
	
	@Autowired
	private RestTemplate restTemplate;

	@Value("${starling.auth.token}")
	private String authtoken;

	@Value("${starling.timeout.value}")
	private Integer timeoutValue;

	@Autowired
	private RestTemplateBuilder restBuilder;

	/**
	 * create restbuilder
	 * @return Http headers
	 */
	public HttpHeaders restBuilder() {
		logger.info("Creating rest connection...!");
		restTemplate = restBuilder.setConnectTimeout(Duration.ofMillis(timeoutValue))
				.setReadTimeout(Duration.ofMillis(timeoutValue)).build();
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
		headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
		headers.add(HttpHeaders.AUTHORIZATION, String.format("Bearer %s", authtoken));
		return headers;
	}

}
