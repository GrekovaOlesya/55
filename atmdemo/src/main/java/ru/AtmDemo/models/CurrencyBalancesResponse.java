package ru.AtmDemo.models;


import java.util.Set;

public class CurrencyBalancesResponse {
    private Set<CurrencyBalance> currencyBalances;

    public CurrencyBalancesResponse(Set<CurrencyBalance> currencyBalances) {
        this.currencyBalances = currencyBalances;
    }
}
