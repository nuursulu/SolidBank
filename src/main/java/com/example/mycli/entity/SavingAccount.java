package com.example.mycli.entity;

public class SavingAccount extends AccountWithdraw {
    public SavingAccount( String clientID, double balance) {
        super("SAVING",  clientID, balance, true);
    }
}
