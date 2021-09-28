/*
* UCF COP3330 Fall 2021 Assignment 2 Solutions
* Copyright 2021 Rafael Alvarez-Romero
*/
package EX31;
import java.io.InputStream;
import java.util.Scanner;

public class app {
    private static final InputStream in = System.in;
    private static final Scanner sc = new Scanner(in);
    private static final app ex31 = new app();

    public static void main(String[] args) {
        ex31.runProgram();
    }

    public void runProgram() {

        String str1 = "Enter your resting heart-rate (BPM): ";
        String str2 = "Enter your age: ";

        int heartRate = Integer.parseInt(getInput(str1));
        int age = Integer.parseInt(getInput(str2));

        printCalculations(heartRate, age);
    }

    private void printCalculations(int heartRate, int age) {

        System.out.printf("Resting Pulse: %d \t \t Age: %d \n\n", heartRate, age);
        System.out.print("Intensity \t | Rate\n");
        System.out.println("-------------|--------");

        for (int i = 55; i <= 95 ; i+=5) {

            System.out.printf(formatting(), i, calculatePulse(age, heartRate, i));

        }
    }

    public int calculatePulse(int age, int hr, int intensity) {

        return (int) ((((220-age) - hr) * (intensity/100.f)) + hr);
    }

    private String getInput(String print) {
        String input;
        do {
            System.out.print(print);
            input = sc.nextLine();
            input = checkInput(input);
        } while (input.equals("0"));
        return input;
    }

    public String checkInput(String input) {
        try {
            if (Integer.parseInt(input) <= 0) {
                System.out.println("Enter a positive integer!");
                return "0";
            }
        } catch (NumberFormatException error) {
            System.out.println("Invalid input!");
            return "0";
        }
        return input;
    }

    private String formatting() {
        return "%d%% \t \t | %d bpm\n";
    }
}