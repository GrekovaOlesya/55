package ru.AtmDemo.services;


import ru.AtmDemo.exceptions.AtmSystemException;
import ru.AtmDemo.repositories.ClientAccountRepository;
import ru.AtmDemo.repositories.CurrencyConversionRepository;
import ru.AtmDemo.repositories.CurrencyRepository;
import ru.AtmDemo.repositories.DenominationRepository;
import ru.AtmDemo.entities.ClientAccount;
import ru.AtmDemo.entities.Currency;
import ru.AtmDemo.entities.CurrencyConversionRate;
import ru.AtmDemo.entities.Denomination;
import ru.AtmDemo.models.CurrencyBalance;
import ru.AtmDemo.models.CurrencyBalancesResponse;
import ru.AtmDemo.models.TransactionBalancesResponse;
import ru.AtmDemo.models.TransactionalBalance;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public abstract class AtmServiceImpl implements AtmService {

    private ClientAccountRepository clientAccountRepository;

    private DenominationRepository denominationRepository;

    private CurrencyConversionRepository currencyConversionRepository;

    private CurrencyRepository currencyRepository;

    private static final String ALLOWED_DENOMINATION_TYPE_CODE = "N";

    private static final String CURRENCY_ACCOUNT_TYPE_CODE = "CFCA";

    public TransactionBalancesResponse getTransactionalAccountBalances(int clientId) throws AtmSystemException {
        final boolean TRANSACTIONAL_STATUS = true;
        List<ClientAccount> clientAccounts = clientAccountRepository.findByClientIdAndTransactionalStatus(clientId,TRANSACTIONAL_STATUS);
        if(clientAccounts.isEmpty()){
            throw new AtmSystemException("No accounts to display.");
        }
        Set<TransactionalBalance> orderedTransactionalBalances = buildOrderedTransactionalBalanceSet(clientAccounts);
        return new TransactionBalancesResponse(orderedTransactionalBalances);
    }

    protected abstract Set<TransactionalBalance> buildOrderedTransactionalBalanceSet(List<ClientAccount> clientAccounts);
}
