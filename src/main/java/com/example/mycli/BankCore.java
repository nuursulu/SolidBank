package com.example.mycli;

import com.example.mycli.entity.AccountType;
import com.example.mycli.service.AccountCreationService;

public class BankCore {
    private static long id = 1;
    private long lastAccountNumber = 1;
    private AccountCreationService accountCreation;

    public BankCore(AccountCreationService accountCreation) {
        this.accountCreation = accountCreation;
    }

    public void createNewAccount(AccountType accountType, String clientID) {
        if(accountType == null) {
            System.out.println("AccountType not exist");
            return;
        }
        accountCreation.create(accountType, this.id, clientID, lastAccountNumber);
        incrementLastAccountNumber();
    }

    private void incrementLastAccountNumber() {
        lastAccountNumber++;
    }
}

