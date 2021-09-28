/*
* UCF COP3330 Fall 2021 Assignment 2 Solutions
* Copyright 2021 Rafael Alvarez-Romero
*/
package EX35;
import java.util.ArrayList;
import java.util.Scanner;
public class winners {
    private final Scanner sc = new Scanner(System.in);
    ArrayList<String> winners = new ArrayList<>();
    int randomWinner = -1;

    public winners() {

        setWinners();
        setRandomWinner();
        getWinner();
    }

    private void setWinners() {

        String input;

        do {

            System.out.print("Enter a name: ");

            input = sc.nextLine();

            if (!input.equals("")) winners.add(input);

        } while (!input.equals(""));
    }

    private void setRandomWinner() {

        randomWinner = (int) ((Math.random() * winners.size()));
    }

    private void getWinner() {
        System.out.printf("The winner is... %s.", winners.get(randomWinner));
    }
}