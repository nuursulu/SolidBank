package com.example.mycli.service;

import com.example.mycli.entity.*;
import com.example.mycli.DAO.AccountDAO;


public class AccountCreationServiceImpl implements AccountCreationService {
    private AccountDAO accountDAO;

    public AccountCreationServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void create(AccountType accountType, long bankID, String clientID, long accountID) {
        String accountNumber = String.format("%03d%06d", 1, accountID);
        Account account = null;
        switch (accountType) {
            case FIXED:
                account = new FixedAccount(accountNumber, clientID, 0.0);
                break;
            case SAVING:
                account = new SavingAccount(accountNumber, clientID, 0.0);
                break;
            case CHECKING:
                account = new CheckingAccount(accountNumber, clientID, 0.0);
                break;
        }
        accountDAO.createNewAccount(account);
        System.out.println("Bank account created");

    }
}

