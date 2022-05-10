package com.example.mycli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


@SpringBootApplication
public class MyCliApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyCliApplication.class, args);
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
            //System.out.printf(" ");
            String line = scanner.nextLine();
            MyCLI cli = new MyCLI(scanner);
//            if (line.contains("1")) ;
//            if (line.contains("2")) ;
//            if (line.contains("3")) ;
//            if (line.contains("4")) ;
//            if (line.contains("5")) ;
//            if (line.contains("6")) help();
//            if (line.contains("7")) exit();
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
        // завершает работу программы - exit
        public static void exit() {
            System.out.println("Application Closed");
            System.exit(0);
        }

}
