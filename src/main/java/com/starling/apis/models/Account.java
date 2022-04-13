package com.starling.apis.models;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {

	private UUID accountUid;
	private String accountType;
	private UUID  defaultCategory;
	private String currency;
	private String createdAt;
	private String name;
	
	
	
	/**
	 * @return the accountUid
	 */
	public UUID getAccountUid() {
		return accountUid;
	}
	/**
	 * @param accountUid the accountUid to set
	 */
	public void setAccountUid(UUID accountUid) {
		this.accountUid = accountUid;
	}
	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}
	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	/**
	 * @return the defaultCategory
	 */
	
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * @return the defaultCategory
	 */
	public UUID getDefaultCategory() {
		return defaultCategory;
	}
	/**
	 * @param defaultCategory the defaultCategory to set
	 */
	public void setDefaultCategory(UUID defaultCategory) {
		this.defaultCategory = defaultCategory;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * @return the createdAt
	 */
	public String getCreatedAt() {
		return createdAt;
	}
	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	

}
