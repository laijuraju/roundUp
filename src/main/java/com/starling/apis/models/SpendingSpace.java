
package com.starling.apis.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SpendingSpace {

    private String name;
    private Balance balance;
    private String cardAssociationUid;
    private Integer sortOrder;
    private String spendingSpaceType;
    private String spaceUid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SpendingSpace withName(String name) {
        this.name = name;
        return this;
    }

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    public SpendingSpace withBalance(Balance balance) {
        this.balance = balance;
        return this;
    }

    public String getCardAssociationUid() {
        return cardAssociationUid;
    }

    public void setCardAssociationUid(String cardAssociationUid) {
        this.cardAssociationUid = cardAssociationUid;
    }

    public SpendingSpace withCardAssociationUid(String cardAssociationUid) {
        this.cardAssociationUid = cardAssociationUid;
        return this;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public SpendingSpace withSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    public String getSpendingSpaceType() {
        return spendingSpaceType;
    }

    public void setSpendingSpaceType(String spendingSpaceType) {
        this.spendingSpaceType = spendingSpaceType;
    }

    public SpendingSpace withSpendingSpaceType(String spendingSpaceType) {
        this.spendingSpaceType = spendingSpaceType;
        return this;
    }

    public String getSpaceUid() {
        return spaceUid;
    }

    public void setSpaceUid(String spaceUid) {
        this.spaceUid = spaceUid;
    }

    public SpendingSpace withSpaceUid(String spaceUid) {
        this.spaceUid = spaceUid;
        return this;
    }

}
