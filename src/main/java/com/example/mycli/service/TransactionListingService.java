package com.example.mycli.service;


import com.example.mycli.entity.Transaction;


import java.util.List;

public interface TransactionListingService {
    List<Transaction> getClientTransactions(String clientID);
    Transaction getClientTransaction(String clientID, String accountID);

}
