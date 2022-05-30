package com.example.mycli;

import com.example.mycli.delivery.*;
import com.example.mycli.entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class MyCliApplication implements CommandLineRunner {
    @Autowired
    // create and configure beans use annotations
    private ApplicationContext context;

    public static void main(String[] args) {
        SpringApplication.run(MyCliApplication.class);
    }

    @Override
    public void run(String... arg0) throws Exception {
        boolean running = true;
        String clientID = "1";
        // retrieve configured instance
        MyCLI myCLI = context.getBean(MyCLI.class);
        AccountBasicCLI accountBasicCLI = context.getBean(AccountBasicCLI.class);
        TransactionBasicCLI transactionBasicCLI = context.getBean(TransactionBasicCLI.class);
        TransactionDepositCLI transactionDepositCLI = context.getBean(TransactionDepositCLI.class);
        TransactionWithdrawCLI transactionWithdrawCLI = context.getBean(TransactionWithdrawCLI.class);

        String helpMessage = "1 - show accounts\n2 - create account\n3 - deposit\n4 - withdraw\n5 - transfer\n6 - this message\n7 - exit\n";
        System.out.printf("Welcome to CLI bank service\n");
        System.out.printf("Enter operation number: \n");
        System.out.printf(helpMessage);
        // use configured instance
        while (running) {
            switch (myCLI.getScanner().next()) {

                case "1":
                    // return accounts list
                    accountBasicCLI.getAccounts(clientID);
                    break;

                case "2":
                    // create new account
                    accountBasicCLI.createAccountRequest(clientID);
                    break;

                case "3":
                    // deposit money
                    transactionDepositCLI.depositMoney(clientID);
                    break;

                case "4":
                    // withdraw money
                    transactionWithdrawCLI.withdrawMoney(clientID);
                    break;
                case "5":
                    transactionBasicCLI.getTransactions(clientID);
                    break;

                case "6":
                    System.out.printf(helpMessage);
                    break;

                case "7":
                    System.out.printf("Application Closed\n");
                    running = false;
                    break;

                default:
                    System.out.printf("Command not recognized!\n");

            }
        }
        myCLI.getScanner().close();
    }
}