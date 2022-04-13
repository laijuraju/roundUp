
package com.starling.apis.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Spaces {

    private List<SavingsGoal> savingsGoals = null;
    private List<SpendingSpace> spendingSpaces = null;

    public List<SavingsGoal> getSavingsGoals() {
        return savingsGoals;
    }

    public void setSavingsGoals(List<SavingsGoal> savingsGoals) {
        this.savingsGoals = savingsGoals;
    }

    public Spaces withSavingsGoals(List<SavingsGoal> savingsGoals) {
        this.savingsGoals = savingsGoals;
        return this;
    }

    public List<SpendingSpace> getSpendingSpaces() {
        return spendingSpaces;
    }

    public void setSpendingSpaces(List<SpendingSpace> spendingSpaces) {
        this.spendingSpaces = spendingSpaces;
    }

    public Spaces withSpendingSpaces(List<SpendingSpace> spendingSpaces) {
        this.spendingSpaces = spendingSpaces;
        return this;
    }

}
