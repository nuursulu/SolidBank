package com.example.mycli.CLI;

import com.example.mycli.TransactionWithdraw;
import com.example.mycli.entity.Account;
import com.example.mycli.service.AccountListingService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor

public class TransactionWithdrawCLI {
    private TransactionWithdraw transactionWithdraw;
    private WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;
    private AccountListingService accountListing;

    public void withdrawMoney(String clientID){
        Account account = accountListing.getClientAccount(clientID, withdrawDepositOperationCLIUI.requestClientAccountNumber());
        if(account == null) System.out.println("Account with this ID not exist");
        if(account!=null){
        transactionWithdraw.execute(account, withdrawDepositOperationCLIUI.requestClientAmount());
        }
    }
}
