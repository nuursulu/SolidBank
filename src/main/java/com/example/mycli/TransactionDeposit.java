package com.example.mycli;

import com.example.mycli.repository.TransactionRepository;
import com.example.mycli.entity.Account;
import com.example.mycli.entity.Transaction;
import com.example.mycli.service.AccountDepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TransactionDeposit {
    private AccountDepositService accountDepositService;
    @Autowired
    private TransactionRepository transactionRepository;

    public TransactionDeposit(AccountDepositService accountDepositService, TransactionRepository transactionRepository) {
        this.accountDepositService = accountDepositService;
        this.transactionRepository = transactionRepository;
    }

    public void execute(Account account, double amount) {
        boolean isAccount = account != null;
        boolean amountCorrect = amount != 0;
        Transaction transaction;
        Date dateNow = new Date();
        if (amountCorrect && isAccount) {
            accountDepositService.deposit(amount, account);
            transaction = new Transaction(account.getId(), account.getClientID(), amount, "deposit", true, dateNow);

            System.out.println(amount + "$ transfered from " + account.getId() + " account");

        } else {
            transaction = new Transaction(account.getId(), account.getClientID(), amount, "deposit", false, dateNow);
            System.out.println("transaction failed");
        }

        transactionRepository.create(transaction.getAccountID(),
                transaction.getClientID(), transaction.getAmount(),
                transaction.getTransactType(), transaction.isStatus(),
                transaction.getTransactionDate());
    }
}
