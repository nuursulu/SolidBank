package com.example.mycli;

import com.example.mycli.DAO.TransactionDAO;
import com.example.mycli.entity.Account;
import com.example.mycli.transaction.Transaction;
import com.example.mycli.service.AccountDepositService;
import org.springframework.stereotype.Component;

@Component
public class TransactionDeposit {
    private AccountDepositService accountDepositService;
    private TransactionDAO transactionDAO;

    public TransactionDeposit(AccountDepositService accountDepositService, TransactionDAO transactionDAO) {
        this.accountDepositService = accountDepositService;
        this.transactionDAO = transactionDAO;
    }

    public void execute(Account account, double amount){
        boolean isAccount =  account!=null;
        boolean amountCorrect = amount!=0;
        if(amountCorrect && isAccount) {
            accountDepositService.deposit(amount, account);
            Transaction transaction = new Transaction(amount + "$ transfered from " + account.getId() + " account");
            transactionDAO.addTransaction(transaction);
            System.out.println(amount + "$ transfered from " + account.getId() + " account");
        }
        else {
            System.out.println("transaction failed");
        }
    }
}
