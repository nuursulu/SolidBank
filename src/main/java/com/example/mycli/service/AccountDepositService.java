package com.example.mycli.service;

import com.example.mycli.entity.Account;

public interface AccountDepositService {
    void deposit(double amount, Account accountWithdraw);
}
