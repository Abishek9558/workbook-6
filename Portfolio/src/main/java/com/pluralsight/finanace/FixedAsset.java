package com.pluralsight.finanace;

public abstract class FixedAsset implements Valuable {
    protected double marketValue;
    protected String name;

    public FixedAsset(double marketValue, String name) {
        this.marketValue = marketValue;
        this.name = name;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
