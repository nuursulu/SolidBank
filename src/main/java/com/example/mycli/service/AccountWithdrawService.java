package com.example.mycli.service;

import com.example.mycli.entity.AccountWithdraw;

public interface AccountWithdrawService {
    void withdraw(double amount,  AccountWithdraw account);
}
