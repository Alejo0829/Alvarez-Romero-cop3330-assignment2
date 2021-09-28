/*
 * UCF COP3330 Fall 2021 Assignment 2 Solutions
 * Copyright 2021 Rafael Alvarez-Romero
*/
package EX28;
import java.util.InputMismatchException;
import java.util.Scanner;

public class app {
    static Scanner sc = new Scanner(System.in);
    static final int COUNT = 5;

    public static void main(String[] args) {

        app ex28 = new app();

        double totalInput = ex28.addNumbers();

        System.out.println("The total is: " + totalInput);

    }

    double addNumbers() {
        double total = 0;
        for (int i = 0; i < COUNT; i++) {
            System.out.printf("Enter a number: ");
            try {
                total += Double.parseDouble(sc.nextLine());
            } catch (InputMismatchException error) {
                System.out.print("Not a valid input.\n");
            }
        }
        return total;
    }
}