package ru.AtmDemo.repositories;

import ru.AtmDemo.entities.CurrencyConversionRate;


public interface CurrencyConversionRepository extends JpaRepository<CurrencyConversionRate,String>  {
    CurrencyConversionRate findByCurrencyCode(String currencyCode);
}

