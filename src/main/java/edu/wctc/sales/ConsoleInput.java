package edu.wctc.sales;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleInput {
    public Scanner scanner = new Scanner(System.in);

    public ConsoleInput(){
        System.out.println("ConsoleInput created");
    }

    public String getInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }
}
