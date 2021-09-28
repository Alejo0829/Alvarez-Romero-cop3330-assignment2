/*
* UCF COP3330 Fall 2021 Assignment 2 Solutions
* Copyright 2021 Rafael Alvarez-Romero
*/
package EX33;
import java.util.Scanner;
public class app {
    private final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("What is your question?");

        String input = sc.nextLine();

        System.out.println(eightBall[generatedNum()]);

    }

    private final static String[] eightBall = {

            "Yes",
            "No",
            "Maybe",
            "Ask again later",
    };

    static int generatedNum() {
        return (int) ((Math.random() * (eightBall.length-1) + 1));
    }
}