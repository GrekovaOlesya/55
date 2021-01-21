package ru.AtmDemo.repositories;

import ru.AtmDemo.entities.Denomination;

import java.util.List;

public interface DenominationRepository extends JpaRepository<Denomination, Integer> {
    List<Denomination> findByDenominationDenominationTypeCode(String denominationTypeCode);
}
