package com.example.mycli.service;

import com.example.mycli.DAO.AccountDAO;
import com.example.mycli.entity.Account;
import org.springframework.stereotype.Service;

@Service
public class AccountWithdrawServiceImpl implements AccountWithdrawService {

    AccountDAO accountDAO;

    public AccountWithdrawServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void withdraw(double amount,  Account accountWithdraw) {
        accountWithdraw.setBalance(accountWithdraw.getBalance() - amount);

    }
}
