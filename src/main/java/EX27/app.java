/*
 * UCF COP3330 Fall 2021 Assignment 2 Solutions
 * Copyright 2021 Rafael Alvarez-Romero
*/
package EX27;
import java.util.Scanner;
public class app {

    static Scanner sc = new Scanner(System.in);
    static String inputFirst;
    static String inputLast;
    static String inputZIP;
    static String inputID;

    public static void main(String[] args) {

        app ex27 = new app();

        ex27.getInput();

        System.out.println(ex27.validateInput(inputFirst, inputLast, inputZIP, inputID));

    }

    void getInput() {

        System.out.print("Enter the first name: ");
        inputFirst = sc.nextLine();
        System.out.print("Enter the last name: ");
        inputLast = sc.nextLine();
        System.out.print("Enter the ZIP code: ");
        inputZIP = sc.nextLine();
        System.out.print("Enter the employee ID: ");
        inputID = sc.nextLine();

    }

    String validateInput(String first, String last, String ZIP, String ID) {

        boolean bool1, bool2, bool3, bool4;

        bool1 = checkFirstName(first);
        bool2 = checkLastName(last);
        bool3 = checkZIP(ZIP);
        bool4 = checkID(ID);

        if (bool1 && bool2 && bool3 && bool4) return "There were no errors found.";

        return "Reenter information correctly!";
    }

    boolean checkFirstName (String input) {

        if (input.length() == 0) {
            System.out.println("The first name must be filled in.\n");
            System.out.printf("The first name must be at least 2 characters long.\n");
            return false;
        } else if (input.length() <= 2) {
            System.out.printf("The first name must be at least 2 characters long.\n");
            return false;
        } else {
            return true;
        }
    }

    boolean checkLastName (String input) {

        if (input.length() == 0) {
            System.out.print("The last name must be filled in.\n");
            System.out.printf("The second name must be at least 2 characters long.\n");
            return false;
        } else if (input.length() <= 2) {
            System.out.printf("The second name must be at least 2 characters long.\n");
            return false;
        } else {
            return true;
        }
    }

    boolean checkZIP (String input) {

        try {
            Integer.parseInt(input);
            if (input.length() != 5) {
                System.out.print("The ZIP code must be five numbers.\n");
                return false;
            }
        } catch (NumberFormatException error) {
            System.out.print("The ZIP code must a 5 digit number.\n");
            return false;
        }

        return true;
    }

    boolean checkID (String input) {

        char[] array = input.toCharArray();
        String invalid = "The employee ID must be in the format of AA-1234.\n";
        String numbers;

        try {
            numbers = new String(array, 3, (array.length-3));
        } catch (StringIndexOutOfBoundsException error) {
            System.out.printf(invalid, input);
            return false;
        }

        try {
            Integer parseInt = Integer.parseInt(numbers);
        } catch (NumberFormatException error) {
            System.out.printf(invalid, input);
            return false;
        }


        if (!(Character.isLetter(array[0]) && Character.isLetter(array[1]))) {
            System.out.printf(invalid, input);
            return false;
        }

        if (array[2] != '-') {
            System.out.printf(invalid, input);
            return false;
        }
        return true;
    }
}