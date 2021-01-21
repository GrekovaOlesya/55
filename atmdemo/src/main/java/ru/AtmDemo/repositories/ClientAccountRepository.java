package ru.AtmDemo.repositories;


import ru.AtmDemo.entities.ClientAccount;

import java.util.List;

public interface ClientAccountRepository extends JpaRepository<ClientAccount,String> {
    List<ClientAccount> findByClientIdAndTransactionalStatus(int clientId, boolean transactionalStatus);

    List<ClientAccount> findByClientIDAndAccountTypeCode(int clientId, String accountTypeCode);

    ClientAccount findByClientIdAndClientAccountNumber(int clientId, String clientAccountNumber);
}

