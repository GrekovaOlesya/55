package ru.AtmDemo.entities;



public class Currency {


    private String currencyCode;

    private int decimalPlaces;

    private String description;

    public Currency(String currencyCode, int decimalPlaces, String description) {
        this.currencyCode = currencyCode;
        this.decimalPlaces = decimalPlaces;
        this.description = description;
    }

    public int getDecimalPlaces() {
        return 0;
    }
}

