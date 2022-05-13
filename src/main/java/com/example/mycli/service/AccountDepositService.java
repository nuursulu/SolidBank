package com.example.mycli.service;

import com.example.mycli.entity.Account;

public interface AccountDepositService {
    public void deposit(double amount, Account accountWithdraw);
}
