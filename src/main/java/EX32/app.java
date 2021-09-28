/*
* UCF COP3330 Fall 2021 Assignment 2 Solutions
* Copyright 2021 Rafael Alvarez-Romero
*/
package EX32;
import java.util.Scanner;
public class app {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String input;

        do {
            new game();
            do {
                System.out.println(game.outPuts[6]);
                input = sc.nextLine();
            } while (!(input.equals("Y") || input.equals("N")));

        } while (input.equals("Y"));
    }
}