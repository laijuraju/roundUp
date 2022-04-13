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
public class FeedItem {

	private String feedItemUid;
	private String categoryUid;
	private Amount amount;
	private String direction;
	private String updatedAt;
	private String transactionTime;
	private String settlementTime;
	private String retryAllocationUntilTime;
	private String source;
	private String sourceSubType;
	private String status;
	private String transactingApplicationUserUid;
	private String counterPartyType;
	private String counterPartyUid;
	private String counterPartyName;
	private String counterPartySubEntityUid;
	private String counterPartySubEntityName;
	private String counterPartySubEntityIdentifier;
	private String counterPartySubEntitySubIdentifier;
	private Integer exchangeRate;
	private Integer totalFees;
	private String reference;
	private String country;
	private String spendingCategory;
	private String userNote;
	private Boolean hasAttachment;
	private Boolean hasReceipt;

	public String getFeedItemUid() {
		return feedItemUid;
	}

	public void setFeedItemUid(String feedItemUid) {
		this.feedItemUid = feedItemUid;
	}

	public FeedItem withFeedItemUid(String feedItemUid) {
		this.feedItemUid = feedItemUid;
		return this;
	}

	public String getCategoryUid() {
		return categoryUid;
	}

	public void setCategoryUid(String categoryUid) {
		this.categoryUid = categoryUid;
	}

	public FeedItem withCategoryUid(String categoryUid) {
		this.categoryUid = categoryUid;
		return this;
	}

	public Amount getAmount() {
		return amount;
	}

	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	public FeedItem withAmount(Amount amount) {
		this.amount = amount;
		return this;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public FeedItem withDirection(String direction) {
		this.direction = direction;
		return this;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public FeedItem withUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
		return this;
	}

	public String getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}

	public FeedItem withTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
		return this;
	}

	public String getSettlementTime() {
		return settlementTime;
	}

	public void setSettlementTime(String settlementTime) {
		this.settlementTime = settlementTime;
	}

	public FeedItem withSettlementTime(String settlementTime) {
		this.settlementTime = settlementTime;
		return this;
	}

	public String getRetryAllocationUntilTime() {
		return retryAllocationUntilTime;
	}

	public void setRetryAllocationUntilTime(String retryAllocationUntilTime) {
		this.retryAllocationUntilTime = retryAllocationUntilTime;
	}

	public FeedItem withRetryAllocationUntilTime(String retryAllocationUntilTime) {
		this.retryAllocationUntilTime = retryAllocationUntilTime;
		return this;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public FeedItem withSource(String source) {
		this.source = source;
		return this;
	}

	public String getSourceSubType() {
		return sourceSubType;
	}

	public void setSourceSubType(String sourceSubType) {
		this.sourceSubType = sourceSubType;
	}

	public FeedItem withSourceSubType(String sourceSubType) {
		this.sourceSubType = sourceSubType;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public FeedItem withStatus(String status) {
		this.status = status;
		return this;
	}

	public String getTransactingApplicationUserUid() {
		return transactingApplicationUserUid;
	}

	public void setTransactingApplicationUserUid(String transactingApplicationUserUid) {
		this.transactingApplicationUserUid = transactingApplicationUserUid;
	}

	public FeedItem withTransactingApplicationUserUid(String transactingApplicationUserUid) {
		this.transactingApplicationUserUid = transactingApplicationUserUid;
		return this;
	}

	public String getCounterPartyType() {
		return counterPartyType;
	}

	public void setCounterPartyType(String counterPartyType) {
		this.counterPartyType = counterPartyType;
	}

	public FeedItem withCounterPartyType(String counterPartyType) {
		this.counterPartyType = counterPartyType;
		return this;
	}

	public String getCounterPartyUid() {
		return counterPartyUid;
	}

	public void setCounterPartyUid(String counterPartyUid) {
		this.counterPartyUid = counterPartyUid;
	}

	public FeedItem withCounterPartyUid(String counterPartyUid) {
		this.counterPartyUid = counterPartyUid;
		return this;
	}

	public String getCounterPartyName() {
		return counterPartyName;
	}

	public void setCounterPartyName(String counterPartyName) {
		this.counterPartyName = counterPartyName;
	}

	public FeedItem withCounterPartyName(String counterPartyName) {
		this.counterPartyName = counterPartyName;
		return this;
	}

	public String getCounterPartySubEntityUid() {
		return counterPartySubEntityUid;
	}

	public void setCounterPartySubEntityUid(String counterPartySubEntityUid) {
		this.counterPartySubEntityUid = counterPartySubEntityUid;
	}

	public FeedItem withCounterPartySubEntityUid(String counterPartySubEntityUid) {
		this.counterPartySubEntityUid = counterPartySubEntityUid;
		return this;
	}

	public String getCounterPartySubEntityName() {
		return counterPartySubEntityName;
	}

	public void setCounterPartySubEntityName(String counterPartySubEntityName) {
		this.counterPartySubEntityName = counterPartySubEntityName;
	}

	public FeedItem withCounterPartySubEntityName(String counterPartySubEntityName) {
		this.counterPartySubEntityName = counterPartySubEntityName;
		return this;
	}

	public String getCounterPartySubEntityIdentifier() {
		return counterPartySubEntityIdentifier;
	}

	public void setCounterPartySubEntityIdentifier(String counterPartySubEntityIdentifier) {
		this.counterPartySubEntityIdentifier = counterPartySubEntityIdentifier;
	}

	public FeedItem withCounterPartySubEntityIdentifier(String counterPartySubEntityIdentifier) {
		this.counterPartySubEntityIdentifier = counterPartySubEntityIdentifier;
		return this;
	}

	public String getCounterPartySubEntitySubIdentifier() {
		return counterPartySubEntitySubIdentifier;
	}

	public void setCounterPartySubEntitySubIdentifier(String counterPartySubEntitySubIdentifier) {
		this.counterPartySubEntitySubIdentifier = counterPartySubEntitySubIdentifier;
	}

	public FeedItem withCounterPartySubEntitySubIdentifier(String counterPartySubEntitySubIdentifier) {
		this.counterPartySubEntitySubIdentifier = counterPartySubEntitySubIdentifier;
		return this;
	}

	public Integer getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(Integer exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public FeedItem withExchangeRate(Integer exchangeRate) {
		this.exchangeRate = exchangeRate;
		return this;
	}

	public Integer getTotalFees() {
		return totalFees;
	}

	public void setTotalFees(Integer totalFees) {
		this.totalFees = totalFees;
	}

	public FeedItem withTotalFees(Integer totalFees) {
		this.totalFees = totalFees;
		return this;
	}

	
	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public FeedItem withReference(String reference) {
		this.reference = reference;
		return this;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public FeedItem withCountry(String country) {
		this.country = country;
		return this;
	}

	public String getSpendingCategory() {
		return spendingCategory;
	}

	public void setSpendingCategory(String spendingCategory) {
		this.spendingCategory = spendingCategory;
	}

	public FeedItem withSpendingCategory(String spendingCategory) {
		this.spendingCategory = spendingCategory;
		return this;
	}

	public String getUserNote() {
		return userNote;
	}

	public void setUserNote(String userNote) {
		this.userNote = userNote;
	}

	public FeedItem withUserNote(String userNote) {
		this.userNote = userNote;
		return this;
	}

	public Boolean getHasAttachment() {
		return hasAttachment;
	}

	public void setHasAttachment(Boolean hasAttachment) {
		this.hasAttachment = hasAttachment;
	}

	public FeedItem withHasAttachment(Boolean hasAttachment) {
		this.hasAttachment = hasAttachment;
		return this;
	}

	public Boolean getHasReceipt() {
		return hasReceipt;
	}

	public void setHasReceipt(Boolean hasReceipt) {
		this.hasReceipt = hasReceipt;
	}

	public FeedItem withHasReceipt(Boolean hasReceipt) {
		this.hasReceipt = hasReceipt;
		return this;
	}
}
