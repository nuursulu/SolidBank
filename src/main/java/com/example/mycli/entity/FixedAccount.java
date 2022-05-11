package com.example.mycli.entity;

public class FixedAccount extends AccountDeposit {
    public FixedAccount(String id, String clientID, double balance) {
        super(AccountType.FIXED, id, clientID, balance, false);
    }
}
