package com.example.mycli.service.Impl;

import com.example.mycli.repository.AccountRepository;
import com.example.mycli.entity.*;
import com.example.mycli.service.AccountCreationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class AccountCreationServiceImpl implements AccountCreationService {


    @Autowired
    private AccountRepository accountRepository;

    public AccountCreationServiceImpl(AccountRepository accountRepository) {

        this.accountRepository = accountRepository;
    }

    @Override
    public void create(String accountType, long bankID, String clientID, long accountID) {

        String accountNumber = String.format("%03d%06d", 1, accountID);
        Account account = null;
        switch (accountType) {
            case "FIXED":
                account = new FixedAccount( clientID, 0.0);
                break;
            case "SAVING":
                account = new SavingAccount( clientID, 0.0);
                break;
            case "CHECKING":
                account = new CheckingAccount(clientID, 0.0);
                break;
        }
        accountRepository.create(account.getId(), account.getAccountType(), account.getClientID(),
                account.getBalance(), account.isWithdrawAllowed());
        long lastNumber = accountRepository.getLastId(clientID);
        String lastAccountNumber = String.format("%03d%06d", 1, lastNumber);
        accountRepository.updateAcc(clientID, lastNumber, lastAccountNumber);
        System.out.println("Bank account created");

    }
}

