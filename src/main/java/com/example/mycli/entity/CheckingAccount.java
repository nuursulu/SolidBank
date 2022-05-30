package com.example.mycli.entity;

public class CheckingAccount extends AccountWithdraw {

    public CheckingAccount( String clientID, double balance) {
        super("CHECKING",  clientID, balance, true);
    }
}
