package com.example.mycli.service.Impl;

import com.example.mycli.repository.AccountRepository;
import com.example.mycli.entity.AccountWithdraw;
import com.example.mycli.service.AccountWithdrawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountWithdrawServiceImpl implements AccountWithdrawService {

    @Autowired
    private AccountRepository accountRepository;

    public AccountWithdrawServiceImpl(AccountRepository accountRepository) {
        this.accountRepository= accountRepository;
    }

    @Override
    public void withdraw(double amount,  AccountWithdraw account) {
        account.setBalance(account.getBalance() - amount);
        accountRepository.updateAccount(account.getId(), account.getClientID(), account.getBalance());

    }
}
