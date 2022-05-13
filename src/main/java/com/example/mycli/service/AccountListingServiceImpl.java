package com.example.mycli.service;

import com.example.mycli.entity.Account;
import com.example.mycli.entity.AccountType;
import com.example.mycli.entity.AccountWithdraw;
import com.example.mycli.DAO.AccountDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountListingServiceImpl implements AccountListingService {
    private AccountDAO accountDAO;

    public AccountListingServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public Account getClientAccount(String clientID, String accountID) {

        Account account = accountDAO.getClientAccount(clientID, accountID);
        return account;
    }
    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {

        AccountWithdraw account = accountDAO.getClientWithdrawAccount(clientID, accountID);
        return account;
    }
    @Override
    public List<Account> getClientAccounts(String clientID) {

        List<Account> clientAccounts = accountDAO.getClientAccounts(clientID);
        return clientAccounts;
    }
    @Override
    public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {

        List<Account> clientAccountsByType = accountDAO.getClientAccountsByType(clientID, accountType);
        return clientAccountsByType;
    }
}
