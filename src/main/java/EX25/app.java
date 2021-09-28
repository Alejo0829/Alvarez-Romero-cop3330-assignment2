/*
* UCF COP 3330 Fall 2021 Assignment 2 Solutions
* Copyright 2021 Rafael Alvarez-Romero
*/

package EX25;
import java.util.Scanner;
public class app {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        app ex25 = new app();

        System.out.print("Enter a password: ");

        String getPass = sc.nextLine();

        int getStr = ex25.passwordValidator(getPass);

        String printThis = "Your password" + " '" + getPass + "' " + passStrength(getStr);

        System.out.println(printThis);
    }

    int passwordValidator(String input) {

        int strLen = input.length();
        int strength = strLen/8;
        String specialChar = "!@#$%^&*";

        if (input.matches(".*\\d.*")) strength++;

        for (int i = 0; i < strLen; i++) {
            if (specialChar.contains(Character.toString((input.charAt(i))))) {
                strength++;
            }
        }
        return strength;
    }

    static String passStrength(int strength) {

        String[] strengthArray =
                {
                        "is weak password.",
                        "is a very weak password.",
                        "is a strong password.",
                        "is strong password.",
                        "is a very strong password."
                };

        return switch (strength) {
            case 0 -> strengthArray[0];
            case 1 -> strengthArray[1];
            case 2 -> strengthArray[2];
            case 3 -> strengthArray[3];
            default -> strengthArray[4];
        };
    }
}