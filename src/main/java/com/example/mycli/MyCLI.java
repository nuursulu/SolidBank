package com.example.mycli;

import com.example.mycli.entity.AccountType;

import java.util.Scanner;

public class MyCLI implements  CLIUI{
    private Scanner scanner;

//    MyCLI() {
//        this.scanner = new Scanner(System.in);
//    }
    MyCLI(Scanner scanner) {
        this.scanner = scanner;
    }

    public double requestClientAmount() {
        return 0;
    }
    public String requestClientAccountNumber() {
        return "";
    }
    @Override
    public AccountType requestAccountType() {
        return AccountType.FIXED;
    }
}
