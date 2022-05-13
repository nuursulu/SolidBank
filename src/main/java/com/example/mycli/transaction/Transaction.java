package com.example.mycli.transaction;

public class Transaction {
    private String transact;

    public Transaction(String transact) {
        this.transact = transact;
    }

    public String getTransact() {
        return transact;
    }

    public void setTransact(String transact) {
        this.transact = transact;
    }
}
