package com.example.mycli.service;

import com.example.mycli.DAO.AccountDAO;
import com.example.mycli.entity.Account;
import org.springframework.stereotype.Service;

@Service
public class AccountDepositServiceImpl implements AccountDepositService{
    private AccountDAO accountDAO;

    public AccountDepositServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void deposit(double amount, Account account) {
        account.setBalance(account.getBalance() + amount);
        //accountDAO.updateAccount(account);
    }
}
