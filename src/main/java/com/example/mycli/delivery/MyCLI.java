package com.example.mycli.delivery;

import com.example.mycli.CLI.CLIUI;
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
        try {
            return Double.parseDouble(scanner.next());

        } catch (Exception e) {
            System.out.println("Incorrect data \nTry again");
        }
        return 0;
    }

    public String requestClientAccountNumber() {
        System.out.println("Type Amount ID");
        return scanner.next();
    }

    @Override
    public String requestAccountType() {

        System.out.println("Choose account type\n[CHECKING, SAVING, FIXED]");

        switch (scanner.next()) {
            case "FIXED":
                return "FIXED";
            case "SAVING":
                return "SAVING";
            case "CHECKING":
                return "CHECKING";
        }
        return "";
    }
}
