package com.example.mycli;

import com.example.mycli.DAO.TransactionDAO;
import com.example.mycli.entity.AccountType;
import com.example.mycli.entity.Account;
import com.example.mycli.transaction.Transaction;
import com.example.mycli.service.AccountWithdrawService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TransactionWithdraw {
    AccountWithdrawService accountWithdrawService;
    TransactionDAO transactionDAO;

    public void execute(Account accountWithdraw, double amount){
        boolean isFixed = accountWithdraw.getAccountType().equals(AccountType.FIXED);
        boolean amountCorrect =  accountWithdraw.getBalance()>amount && amount!=0;
        boolean isAccount =  accountWithdraw!=null;
        if(!isFixed && amountCorrect && isAccount) {
            accountWithdrawService.withdraw(amount, accountWithdraw);
            Transaction transaction = new Transaction(amount + "$ transfered from " + accountWithdraw.getId() + " account");
            transactionDAO.addTransaction(transaction);
            System.out.println(amount + "$ transferred from " + accountWithdraw.getId() + " account");
        }
        else {
            System.out.println("transaction failed");
        }
    }
}
