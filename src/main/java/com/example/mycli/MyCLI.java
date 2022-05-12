package com.example.mycli;

import com.example.mycli.entity.AccountType;

import java.util.Scanner;

public class MyCLI implements  CLIUI {
    private Scanner scanner;
    MyCLI() {
        this.scanner = new Scanner(System.in);
    }

    public double requestClientAmount() {
        return 0.0;
    }

    public String requestClientAccountNumber() {
        return "";
    }

    @Override
    public AccountType requestAccountType() {
        System.out.println("Choose account type\n[CHECKING, SAVING, FIXED]");

        switch (scanner.next()) {
            case "FIXED":
                return AccountType.FIXED;
            case "SAVING":
                return AccountType.SAVING;
            case "CHECKING":
                return AccountType.CHECKING;
        }
        return null;
    }
}
