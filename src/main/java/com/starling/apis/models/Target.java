
package com.starling.apis.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Target {

    private String currency;
    private Integer minorUnits;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Target withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public Integer getMinorUnits() {
        return minorUnits;
    }

    public void setMinorUnits(Integer minorUnits) {
        this.minorUnits = minorUnits;
    }

    public Target withMinorUnits(Integer minorUnits) {
        this.minorUnits = minorUnits;
        return this;
    }

}
