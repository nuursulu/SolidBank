package com.example.mycli.entity;

public class FixedAccount extends AccountDeposit {
    public FixedAccount( String clientID, double balance) {
        super("FIXED", clientID, balance, false);
    }
}
