package com.example.mycli.service;

import com.example.mycli.entity.Account;

public interface AccountWithdrawService {
    public void withdraw(double amount,  Account accountWithdraw);
}
