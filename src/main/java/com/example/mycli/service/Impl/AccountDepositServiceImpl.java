package com.example.mycli.service.Impl;

import com.example.mycli.repository.AccountRepository;
import com.example.mycli.entity.Account;
import com.example.mycli.service.AccountDepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountDepositServiceImpl implements AccountDepositService {
    @Autowired
    private AccountRepository accountRepository;

    public AccountDepositServiceImpl(AccountRepository accountRepository) {

        this.accountRepository = accountRepository;
    }
    @Override
    public void deposit(double amount, Account account) {
        account.setBalance(account.getBalance() + amount);
        accountRepository.updateAccount(account.getId(), account.getClientID(), account.getBalance());
    }
}
