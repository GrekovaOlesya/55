package ru.AtmDemo.models;



import java.util.Set;


public class TransactionBalancesResponse {
    private Set<TransactionalBalance> transactionalBalances;

    public TransactionBalancesResponse(Set<TransactionalBalance> transactionalBalances) {
        this.transactionalBalances = transactionalBalances;
    }
}

