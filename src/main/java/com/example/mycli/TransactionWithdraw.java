package com.example.mycli;

import com.example.mycli.repository.TransactionRepository;
import com.example.mycli.entity.AccountWithdraw;
import com.example.mycli.entity.Transaction;
import com.example.mycli.service.AccountWithdrawService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@AllArgsConstructor
public class TransactionWithdraw {
    AccountWithdrawService accountWithdrawService;
    //    TransactionDAO transactionDAO;
    @Autowired
    private TransactionRepository transactionRepository;

    public void execute(AccountWithdraw account, double amount) {
        boolean amountCorrect = account.getBalance() >= amount && amount != 0;
        boolean isAccount = account != null;
        Transaction transaction;
        Date dateNow = new Date();
        if (amountCorrect && isAccount) {
            accountWithdrawService.withdraw(amount, account);
            transaction = new Transaction(account.getId(), account.getClientID(),
                    amount, "withdraw", true, dateNow);
            System.out.println(amount + "$ transferred from " + account.getId() + " account");

        } else {
            transaction = new Transaction(account.getId(), account.getClientID(),
                    amount, "withdraw", false, dateNow);
            System.out.println("transaction failed");
        }
        transactionRepository.create(transaction.getAccountID(),
                transaction.getClientID(), transaction.getAmount(),
                transaction.getTransactType(), transaction.isStatus(),
                transaction.getTransactionDate());
    }
}
