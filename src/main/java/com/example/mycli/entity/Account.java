package com.example.mycli.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(value = "Accounts")
public class Account {

    @Column(value = "accountType")
    private String accountType;
    @Id
    @Column(value = "accountId")
    private String id;
    @Column(value = "clientId")
    private String clientID;
    @Column(value = "balance")
    private double balance;
    @Column(value = "withdrawAllowed")
    private boolean withdrawAllowed;

    public Account(String accountType, String clientID, double balance, boolean withdrawAllowed) {
        this.accountType = accountType;
        this.clientID = clientID;
        this.balance = balance;
        this.withdrawAllowed = withdrawAllowed;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getClientID() {

        return clientID;
    }

    public void setClientID(String clientID) {

        this.clientID = clientID;
    }

    public boolean isWithdrawAllowed() {

        return withdrawAllowed;
    }

    public void setWithdrawAllowed(boolean withdrawAllowed) {

        this.withdrawAllowed = withdrawAllowed;
    }

    @Override
    public String toString() {
        return "\nAccount{" +
                "accountType=" + accountType +
                ", id='" + id + '\'' +
                ", clientID='" + clientID + '\'' +
                ", balance=" + balance +
                ", withdrawAllowed=" + withdrawAllowed +
                '}';
    }


}
