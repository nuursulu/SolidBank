package com.example.mycli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class MyCliApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyCliApplication.class, args);
        ApplicationContext context = new ClassPathXmlApplicationContext("props.xml");
        AccountBasicCLI accountBasicCLI = context.getBean(AccountBasicCLI.class);

        String clientID="1";
        System.out.println("Welcome to CLI bank serviceEnter operation number:\n" +
                "1 - show accounts\n" +
                "2 - create account\n" +
                "3 - deposit\n" +
                "4 - withdraw\n" +
                "5 - transfer\n" +
                "6 - this message\n" +
                "7 - exit\n");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            switch (line){
                case "1":
                    accountBasicCLI.getAccounts(clientID); break;
                case "2":
                    accountBasicCLI.createAccountRequest(clientID); break;
                case "3":
                case "4":
                case "5":
                    System.out.println("Command not realised"); break;
                case "6":
                    help(); break;
                case "7":
                    exit(); break;
                default:
                    System.out.println("Command not exist");
            }
        }
    }
        // выводит список команд и их описание - help
        public static void help () {
            System.out.println("Welcome to CLI bank serviceEnter operation number:\n" +
                    "1 - show accounts\n" +
                    "2 - create account\n" +
                    "3 - deposit\n" +
                    "4 - withdraw\n" +
                    "5 - transfer\n" +
                    "6 - this message\n" +
                    "7 - exit\n");
        }
        public static void exit() {
            System.out.println("Application Closed");
            System.exit(0);
        }

}
