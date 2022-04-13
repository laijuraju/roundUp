/**
 * 
 */
package com.starling.apis.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author LAIJU
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Amount {

	private String currency;
	private Integer minorUnits;

	public Amount(int minorUnits, String currency) {
		this.currency = currency;
		this.minorUnits = minorUnits;
		
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Amount withCurrency(String currency) {
		this.currency = currency;
		return this;
	}

	public Integer getMinorUnits() {
		return minorUnits;
	}

	public void setMinorUnits(Integer minorUnits) {
		this.minorUnits = minorUnits;
	}

	public Amount withMinorUnits(Integer minorUnits) {
		this.minorUnits = minorUnits;
		return this;
	}

}
