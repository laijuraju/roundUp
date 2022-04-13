/**
 * 
 */
package com.starling.apis.models;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author LAIJU
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddMoneyResponse {

	private UUID transferUid;
	private Boolean success;

	public AddMoneyResponse(UUID uuid, boolean success) {
		this.transferUid = uuid;
		this.success = false;
	}

	/**
	 * @return the transferUid
	 */
	public UUID getTransferUid() {
		return transferUid;
	}

	/**
	 * @param transferUid the transferUid to set
	 */
	public void setTransferUid(UUID transferUid) {
		this.transferUid = transferUid;
	}

	/**
	 * @return the success
	 */
	public Boolean getSuccess() {
		return success;
	}

	/**
	 * @param success the success to set
	 */
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	/**
	 * @return the errors
	 */
	/*
	 * public List<Error> getErrors() { return errors; }
	 *//**
		 * @param errors the errors to set
		 *//*
			 * public void setErrors(List<Error> errors) { this.errors = errors; }
			 */

}
