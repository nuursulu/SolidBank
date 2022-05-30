package com.example.mycli.delivery;

import com.example.mycli.CLI.WithdrawDepositOperationCLIUI;
import com.example.mycli.service.TransactionListingService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TransactionBasicCLI {
    private WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;
    private TransactionListingService transactionListingService;


    public void getTransactions(String clientID){
        System.out.println(transactionListingService.getClientTransactions(clientID));
    }


}
