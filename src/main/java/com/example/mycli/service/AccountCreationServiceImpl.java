package com.example.mycli.service;

import com.example.mycli.entity.Account;
import com.example.mycli.entity.AccountType;
import com.example.mycli.DAO.AccountDAO;
import com.example.mycli.service.AccountCreationService;

public class AccountCreationServiceImpl implements AccountCreationService {
    private AccountDAO accountDAO;

    public AccountCreationServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void create(AccountType accountType, long bankID, String clientID, long accountID) {
        //String accountNumber = String.format("%03d%06d", 1, accountID);

    }
}
