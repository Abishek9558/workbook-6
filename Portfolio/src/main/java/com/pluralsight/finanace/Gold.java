package com.pluralsight.finanace;

public class Gold extends FixedAsset{
    private double weight;

    public Gold(double marketValue, String name, double weight) {
        super(marketValue, name);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
