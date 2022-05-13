package com.example.mycli.CLI;

import com.example.mycli.TransactionDeposit;
import com.example.mycli.entity.Account;
import com.example.mycli.service.AccountListingService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TransactionDepositCLI {

    TransactionDeposit transactionDeposit;
    WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;
    AccountListingService accountListing;

    public void depositMoney(String clientID){
        Account account = accountListing.getClientWithdrawAccount(clientID, withdrawDepositOperationCLIUI.requestClientAccountNumber());
        if(account == null) System.out.println("Account with this ID not exist");
        if(account!=null){
            transactionDeposit.execute(account, withdrawDepositOperationCLIUI.requestClientAmount());
        }
    }
}
