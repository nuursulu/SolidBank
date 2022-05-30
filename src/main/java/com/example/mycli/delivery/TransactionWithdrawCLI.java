package com.example.mycli.delivery;

import com.example.mycli.CLI.WithdrawDepositOperationCLIUI;
import com.example.mycli.TransactionWithdraw;
import com.example.mycli.entity.Account;
import com.example.mycli.entity.AccountWithdraw;
import com.example.mycli.service.AccountListingService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor

public class TransactionWithdrawCLI {
    private TransactionWithdraw transactionWithdraw;
    private WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;
    private AccountListingService accountListing;

    public void withdrawMoney(String clientID) {
        AccountWithdraw account = accountListing.getClientWithdrawAccount(clientID, withdrawDepositOperationCLIUI.requestClientAccountNumber());
        if (account == null) System.out.println("Acount not withdrawable");
        if (account != null) {
            transactionWithdraw.execute(account, withdrawDepositOperationCLIUI.requestClientAmount());
        }
    }
}
