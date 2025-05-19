package com.pluralsight.finanace;

public class House extends FixedAsset{
    private int yearBuilt;
    private double squareFeet;
    private int bedrooms;

    public House(double marketValue, String name, int yearBuilt, double squareFeet, int bedrooms) {
        super(marketValue, name);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public double getSquareFeet() {
        return squareFeet;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
