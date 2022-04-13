
package com.starling.apis.models;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SavingsGoal {

    private UUID savingsGoalUid;
    private String name;
    private Target target;
    private TotalSaved totalSaved;
    private Integer savedPercentage;
    private Integer sortOrder;
    
    

    /**
	 * @return the savingsGoalUid
	 */
	public UUID getSavingsGoalUid() {
		return savingsGoalUid;
	}

	/**
	 * @param savingsGoalUid the savingsGoalUid to set
	 */
	public void setSavingsGoalUid(UUID savingsGoalUid) {
		this.savingsGoalUid = savingsGoalUid;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SavingsGoal withName(String name) {
        this.name = name;
        return this;
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public SavingsGoal withTarget(Target target) {
        this.target = target;
        return this;
    }

    public TotalSaved getTotalSaved() {
        return totalSaved;
    }

    public void setTotalSaved(TotalSaved totalSaved) {
        this.totalSaved = totalSaved;
    }

    public SavingsGoal withTotalSaved(TotalSaved totalSaved) {
        this.totalSaved = totalSaved;
        return this;
    }

    public Integer getSavedPercentage() {
        return savedPercentage;
    }

    public void setSavedPercentage(Integer savedPercentage) {
        this.savedPercentage = savedPercentage;
    }

    public SavingsGoal withSavedPercentage(Integer savedPercentage) {
        this.savedPercentage = savedPercentage;
        return this;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public SavingsGoal withSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

}
