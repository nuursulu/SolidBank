package com.example.mycli.entity;

public class AccountWithdraw extends Account {
    public AccountWithdraw(String accountType,  String clientID, double balance, boolean withdrawAllowed) {
        super(accountType,  clientID, balance, withdrawAllowed);
    }
}
