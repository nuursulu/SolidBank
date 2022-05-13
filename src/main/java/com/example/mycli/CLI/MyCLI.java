package com.example.mycli.CLI;

import com.example.mycli.entity.AccountType;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class MyCLI implements CLIUI {
    private Scanner scanner;
    MyCLI() {
        this.scanner = new Scanner(System.in);
    }

    public Scanner getScanner() {
        return scanner;
    }

    public double requestClientAmount() {
        System.out.println("Type Amount of money");
        //boolean isCorrectAmount = Double.parseDouble(scanner.next());
        return Double.parseDouble(scanner.next());
        //return scanner.nextDouble();
    }

    public String requestClientAccountNumber() {
        System.out.println("Type Amount ID");
        return scanner.next();
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
