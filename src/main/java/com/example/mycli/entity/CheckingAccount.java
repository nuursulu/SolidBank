package com.example.mycli.entity;

public class CheckingAccount extends AccountWithdraw {

    public CheckingAccount(String id, String clientID, double balance) {
        super(AccountType.CHECKING, id, clientID, balance, true);
    }
}
