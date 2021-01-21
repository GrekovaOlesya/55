package ru.AtmDemo;


import ru.AtmDemo.repositories.ClientAccountRepository;
import ru.AtmDemo.repositories.CurrencyConversionRepository;
import ru.AtmDemo.repositories.CurrencyRepository;
import ru.AtmDemo.repositories.DenominationRepository;
import ru.AtmDemo.entities.ClientAccount;
import ru.AtmDemo.entities.Currency;
import ru.AtmDemo.entities.CurrencyConversionRate;
import ru.AtmDemo.entities.Denomination;

import java.util.List;


public class RepositoryTests {


    
    private ClientAccountRepository clientAccountRepository;


    private CurrencyConversionRepository currencyConversionRepository;


    private CurrencyRepository currencyRepository;


    private DenominationRepository denominationRepository;
    private Object AssertionsForClassTypes;

    @Test
    public void whenFindByDenominationTypeCode_thenReturnDenominations() {
        final String NOTE_DENOMINATION_TYPE = "N";
        final int NUMBER_OF_NOTE_TYPES = 5;
        List<Denomination> denominations = denominationRepository.findByDenominationDenominationTypeCode(NOTE_DENOMINATION_TYPE);
    }
    

    @Test
    public void whenFindByCurrencyCode_thenReturnCurrency() {
        final String RUSSIAN_CURRENCY_CODE = "RUB";
        Currency currency = currencyRepository.findByCurrencyCode(RUSSIAN_CURRENCY_CODE);
    }


    @Test
    public void whenFindByCurrencyCode_thenReturnCurrencyConversion(Object AssertionsForClassTypes) {
        final String JAPANESE_CURRENCY_CODE = "JPY";
        CurrencyConversionRate currencyConversion = currencyConversionRepository.findByCurrencyCode(JAPANESE_CURRENCY_CODE);
    }

    @Test
    public void whenFindByClientIdAndTransactionalStatus_thenReturnClientAccounts() {
        List<ClientAccount> clientAccounts = clientAccountRepository.findByClientIdAndTransactionalStatus(1, true);
    }

    @Test
    public void whenFindByClientIDAndAccountTypeCode_thenReturnClientAccounts() {
        final String HOME_LOAD_ACCOUNT_CODE = "HLOAN";
        List<ClientAccount> clientAccounts = clientAccountRepository.findByClientIDAndAccountTypeCode(1, HOME_LOAD_ACCOUNT_CODE);
    }

    @Test
    public void whenFindByClientIdAndClientAccountNumber_thenReturnClientAccount() {
        final String SAVINGS_ACCOUNT_CODE = "SVGS";
        final String SAVINGS_ACCOUNT_NUMBER = "1053664521";
        ClientAccount clientAccount = clientAccountRepository.findByClientIdAndClientAccountNumber(1, SAVINGS_ACCOUNT_NUMBER);
    }
}
