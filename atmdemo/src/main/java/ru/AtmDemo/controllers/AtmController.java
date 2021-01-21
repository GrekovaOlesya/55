package ru.AtmDemo.controllers;
import ru.AtmDemo.exceptions.AtmSystemException;
import ru.AtmDemo.services.AtmService;

public class AtmController {

    private AtmService atmService;
    public ru.AtmDemo.models.TransactionBalancesResponse getTransactionalAccountBalances(int clientId) throws AtmSystemException {
        return atmService.getTransactionalAccountBalances(clientId);
    }
    public ru.AtmDemo.models.CurrencyBalancesResponse getCurrencyAccountBalances(int clientId) throws AtmSystemException {
        return atmService.getCurrencyAccountBalances(clientId);
    }

}
