package com.example.mycli.DAO;

import com.example.mycli.transaction.Transaction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class MemoryTransactionDAO implements TransactionDAO{

    private List<Transaction> transactions = new ArrayList<>();;

    @Override
    public List<Transaction> getTransactions() {
        return null;
    }

    @Override
    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }

    @Override
    public List<Transaction> getClientTransactions(String clientID) {
        return this.transactions;
    }
}
