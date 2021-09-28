/*
 * UCF COP3330 Fall 2021 Assignment 2 Solutions
 * Copyright 2021 Rafael Alvarez-Romero
*/
package EX29;
import java.util.Scanner;
public class app {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        app ex29 = new app();

        double rate = ex29.calcRate(Double.parseDouble(ex29.getInput()));

        System.out.printf("It will take %.2f years to double your initial investment.", rate);

    }

    double calcRate(double r) {
        return (72/r);
    }

    boolean checkInput(String input) {
        boolean bool = true;
        try {
            double test = Double.parseDouble(input);
            if (test <= 0) {
                out.printError(2);
                bool = false;
            }
        } catch (NumberFormatException error) {
            out.printError(1);
            bool = false;
        }
        return bool;
    }

    String getInput() {
        String userInput;

        do {
            out.askInput();
            userInput = sc.nextLine();
        } while(!(checkInput(userInput)));

        return userInput;
    }
}