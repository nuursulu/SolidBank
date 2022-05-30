package com.example.mycli.service.Impl;

import com.example.mycli.repository.AccountRepository;
import com.example.mycli.entity.Account;
import com.example.mycli.entity.AccountWithdraw;
import com.example.mycli.service.AccountListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountListingServiceImpl implements AccountListingService {
    @Autowired
    private AccountRepository accountRepository;

    public AccountListingServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account getClientAccount(String clientID, String accountID) {
        return accountRepository.getClientAccount(clientID, accountID);
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
        return accountRepository.getClientWithdrawAccount(clientID, accountID);
    }

    @Override
    public List<Account> getClientAccounts(String clientID) {
        return accountRepository.getClientAccounts(clientID);

    }

    @Override
    public List<Account> getClientAccountsByType(String clientID, String accountType) {
        return accountRepository.getClientAccountsByType(clientID, accountType);
    }
}
