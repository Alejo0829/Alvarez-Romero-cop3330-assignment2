/*
 * UCF COP3330 Fall 2021 Assignment 2 Solutions
 * Copyright 2021 Rafael Alvarez-Romero
*/
package EX29;
public class out {
    static String[] error = {
            "", // avoids i = 0 instances in for-loops
            "Sorry. That is not a valid input.",
            "Sorry. That is not a valid input.",
            "Sorry. That is not a valid input.",

    };

    static String askInput =
            "What is the rate of return? ";

    public static void printError(int i) {
        System.out.println(error[i]);
    }

    public static void askInput() {
        System.out.print(askInput);
    }
}