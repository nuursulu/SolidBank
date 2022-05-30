package com.example.mycli.repository;

import com.example.mycli.entity.Transaction;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface TransactionRepository extends CrudRepository<Transaction, String> {


    @Query("SELECT * FROM Transactions WHERE clientId = :clientID")
    List<Transaction> getClientTransactions(String clientID);

    @Query("SELECT * FROM Transactions WHERE clientId = :clientID and accountId = :accountID")
    Transaction getClientTransaction(String clientID, String accountID);

    @Modifying
    @Query("INSERT INTO Transactions(accountId, clientId, amount, transactType, status, transactionDate)" +
            " VALUES ( :accountID, :clientID, :amount, :transactionType, :status,:transactionDate)")
    void create(String accountID, String clientID, double amount, String transactionType, boolean status, Date transactionDate);





}
