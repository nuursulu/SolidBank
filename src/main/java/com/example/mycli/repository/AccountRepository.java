package com.example.mycli.repository;


import com.example.mycli.entity.Account;
import com.example.mycli.entity.AccountWithdraw;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface AccountRepository extends CrudRepository<Account, String> {


    @Query("SELECT * FROM Accounts WHERE clientId = :clientID")
    List<Account> getClientAccounts(String clientID);

    @Query("SELECT MAX(id) FROM Accounts WHERE clientId = :clientID")
    long getLastId(String clientID);
    @Query("SELECT * FROM Accounts WHERE clientId = :clientID and accountId = :accountID")
    Account getClientAccount(String clientID, String accountID);

    @Query("SELECT * FROM Accounts WHERE clientId = :clientID and accountId = :accountID and withdrawAllowed = true")
    AccountWithdraw getClientWithdrawAccount(String clientID, String accountID);

    @Query("SELECT * FROM Accounts WHERE clientId = :clientID and accountType = :accountType")
    List<Account> getClientAccountsByType(String clientID, String accountType);

    @Modifying
    @Query("INSERT INTO Accounts(accountId, accountType, clientId, balance, withdrawAllowed) VALUES ( :accountID,  :accountType, :clientID, :balance,:withdrawAllowed)")
    void create(String accountID,  String accountType, String clientID, double balance, boolean withdrawAllowed);

    @Modifying
    @Query("UPDATE Accounts set balance = :balance where accountId = :accountID and clientId = :clientID")
    void updateAccount(String accountID, String clientID, double balance);

    @Modifying
    @Query("UPDATE Accounts set accountId = :lastAccountNumber where id = :lastNumber and clientId = :clientID")
    void updateAcc( String clientID, long lastNumber, String lastAccountNumber);

}
