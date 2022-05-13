package com.example.mycli;
//
//import com.example.mycli.CLI.AccountBasicCLI;
//import com.example.mycli.CLI.TransactionDepositCLI;
//import com.example.mycli.CLI.TransactionWithdrawCLI;
//import org.springframework.boot.SpringApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import java.util.Scanner;
//
////@SpringBootApplication
//public class MyCliApplication {
//    public static void main(String[] args) {
//        SpringApplication.run(MyCliApplication.class, args);
//        ApplicationContext context = new ClassPathXmlApplicationContext("props.xml");
//        AccountBasicCLI accountBasicCLI = context.getBean(AccountBasicCLI.class);
//        TransactionWithdrawCLI transactionWithdrawCLI = context.getBean(TransactionWithdrawCLI.class);
//        TransactionDepositCLI transactionDepositCLI = context.getBean(TransactionDepositCLI.class);
//        String clientID="1";
//        System.out.println("Welcome to CLI bank serviceEnter operation number:\n" +
//                "1 - show accounts\n" +
//                "2 - create account\n" +
//                "3 - deposit\n" +
//                "4 - withdraw\n" +
//                "5 - transfer\n" +
//                "6 - this message\n" +
//                "7 - exit\n");
//
//        while (true) {
//            Scanner scanner = new Scanner(System.in);
//            String line = scanner.nextLine();
//            switch (line){
//                case "1":
//                    accountBasicCLI.getAccounts(clientID); break;
//                case "2":
//                    accountBasicCLI.createAccountRequest(clientID); break;
//                case "3":
//                    transactionDepositCLI.depositMoney(clientID); break;
//                case "4":
//                    transactionWithdrawCLI.withdrawMoney(clientID); break;
//                case "5":
//                    System.out.println("Command not realised"); break;
//                case "6":
//                    help(); break;
//                case "7":
//                    exit(); break;
//                default:
//                    System.out.println("Command not exist");
//            }
//        }
//    }
//        // выводит список команд и их описание - help
//        public static void help () {
//
//        System.out.println("Welcome to CLI bank serviceEnter operation number:\n" +
//                    "1 - show accounts\n" +
//                    "2 - create account\n" +
//                    "3 - deposit\n" +
//                    "4 - withdraw\n" +
//                    "5 - transfer\n" +
//                    "6 - this message\n" +
//                    "7 - exit\n");
//        }
//        public static void exit() {
//
//        System.out.println("Application Closed");
//            System.exit(0);
//        }
//
//}

import com.example.mycli.CLI.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyCliApplication implements CommandLineRunner {
    @Autowired
    private ApplicationContext context;

    public static void main(String[] args) {
        SpringApplication.run(MyCliApplication.class);
    }

    @Override
    public void run(String... arg0) throws Exception {
        boolean running = true;
        String clientID = "1";

        MyCLI myCLI = context.getBean(MyCLI.class);
        AccountBasicCLI accountBasicCLI = context.getBean(AccountBasicCLI.class);
        TransactionDepositCLI transactionDepositCLI = context.getBean(TransactionDepositCLI.class);
        TransactionWithdrawCLI transactionWithdrawCLI = context.getBean(TransactionWithdrawCLI.class);

        String helpMessage = "1 - show accounts\n2 - create account\n3 - deposit\n4 - withdraw\n5 - transfer\n6 - this message\n7 - exit\n";
        System.out.printf("Welcome to CLI bank service\n");
        System.out.printf("Enter operation number: \n");
        System.out.printf(helpMessage);
        while(running){
            switch(myCLI.getScanner().next()){

                case "1":
                    accountBasicCLI.getAccounts(clientID);
                    break;

                case "2":
                    accountBasicCLI.createAccountRequest(clientID);
                    break;

                case "3":
                    transactionDepositCLI.depositMoney(clientID);
                    break;

                case "4":
                    transactionWithdrawCLI.withdrawMoney(clientID);
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