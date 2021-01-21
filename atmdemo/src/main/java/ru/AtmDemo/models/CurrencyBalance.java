package ru.AtmDemo.models;


public class CurrencyBalance implements Comparable<CurrencyBalance>{

    private double currencyBalance;

    private double conversionRate;

    private double multiplicationRate;

    private double rubAmount;

    public CurrencyBalance(double currencyBalance, double conversionRate, double multiplicationRate, double rubAmount) {
        this.currencyBalance = currencyBalance;
        this.conversionRate = conversionRate;
        this.multiplicationRate = multiplicationRate;
        this.rubAmount = rubAmount;
    }
    public int compareTo(CurrencyBalance o) {
        return Double.compare(this.rubAmount,o.rubAmount);
    }
}

