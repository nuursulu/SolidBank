package com.example.mycli.service.Impl;

import com.example.mycli.repository.TransactionRepository;
import com.example.mycli.entity.Transaction;
import com.example.mycli.service.TransactionListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TransactionListingServiceImpl implements TransactionListingService {

    @Autowired
    private TransactionRepository transactionRepository;

    public TransactionListingServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public List<Transaction> getClientTransactions(String clientID) {
        return transactionRepository.getClientTransactions(clientID);
    }

    @Override
    public Transaction getClientTransaction(String clientID, String accountID) {
        return transactionRepository.getClientTransaction(clientID, accountID);
    }
}
