package com.example.mycli.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Data
@AllArgsConstructor
@Table(value = "Transactions")
public class Transaction {
//    private @Id String id;
    @Column(value = "accountId")
    private String accountID;
    @Column(value = "clientId")
    private String clientID;
    @Column(value = "amount")
    private double amount;
    @Column(value = "transactType")
    private String transactType;
    @Column(value = "status")
    private boolean status;
    @Column(value = "transactionDate")
    private Date transactionDate;

    @Override
    public String toString() {
        return "\nTransaction{" +
                ", accountID='" + accountID + '\'' +
                ", clientID='" + clientID + '\'' +
                ", amount=" + amount +
                ", transactType='" + transactType + '\'' +
                ", status=" + status +
                ", transactionDate=" + transactionDate +
                '}';
    }
}
