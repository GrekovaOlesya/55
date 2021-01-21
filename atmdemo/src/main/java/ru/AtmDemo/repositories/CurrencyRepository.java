package ru.AtmDemo.repositories;

import ru.AtmDemo.entities.Currency;


public interface CurrencyRepository extends JpaRepository<Currency,String> {
    Currency findByCurrencyCode(String currencyCode);
}
