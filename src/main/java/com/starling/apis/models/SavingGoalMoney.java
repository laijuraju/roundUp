/**
 * 
 */
package com.starling.apis.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author LAIJU
 *
 */
@JsonIgnoreProperties
public class SavingGoalMoney {
	
	private Amount amount;

	public SavingGoalMoney(Amount amount) {
		this.amount = amount;
	}

	/**
	 * @return the amount
	 */
	public Amount getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Amount amount) {
		this.amount = amount;
	}
	
	

}
