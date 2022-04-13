/**
 * 
 */
package com.starling.roundUp.ResponseModel;

/**
 * @author LAIJU
 *
 */
public class CommonResponse {

	private boolean status;
	private String message;
	
	public CommonResponse(boolean status, String message) {
		this.message = message;
		this.status = status;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
