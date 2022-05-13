package com.example.mycli.DAO;

import com.example.mycli.transaction.Transaction;

import java.util.List;

public interface TransactionDAO {
    public List<Transaction> getTransactions();

    public void addTransaction(Transaction transaction);

    public List<Transaction> getClientTransactions(String clientID);
}
