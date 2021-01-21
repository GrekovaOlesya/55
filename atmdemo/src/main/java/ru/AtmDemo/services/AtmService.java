package ru.AtmDemo.services;
import ru.AtmDemo.exceptions.AtmSystemException;
import ru.AtmDemo.models.CurrencyBalancesResponse;
import ru.AtmDemo.models.TransactionBalancesResponse;

@Component
public interface AtmService {

    TransactionBalancesResponse getTransactionalAccountBalances(int clientId) throws AtmSystemException;

    CurrencyBalancesResponse getCurrencyAccountBalances(int clientId) throws AtmSystemException;
}