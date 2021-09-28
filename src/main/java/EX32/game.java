/*
* UCF COP3330 Fall 2021 Assignment 2 Solutions
* Copyright 2021 Rafael Alvarez-Romero
*/
package EX32;
import java.util.Scanner;
public class game {
    private final Scanner sc = new Scanner(System.in);

    private final int[] levelRange = { 0, 1, 2, 3 };

    private int generatedNum, difficulty, userInput = -1;

    private int attempts = 0;

    public game() {

        System.out.println(outPuts[0] + "\n");

        setDifficulty();

        setGeneratedNum();

        tryGuessing();

    }

    private void tryGuessing() {
        do {

            attempts++;
            inputToInt();
            if (userInput != -1) checkNumber();

        } while (userInput != generatedNum);
    }

    private void setDifficulty() {

        do {
            System.out.print(outPuts[1]);
            inputToInt();
        } while (userInput < levelRange[1] || userInput > levelRange[levelRange.length-1]);

        difficulty = userInput;
        userInput = -1; // resets user input
    }

    private void setGeneratedNum () {

        int maximum = (int) Math.pow(10, difficulty);
        System.out.printf(outPuts[2], 1, maximum);
        generatedNum = (int) ((Math.random() * (maximum-1) + 1));

    }

    private void inputToInt() {

        int output;
        String input = sc.nextLine();

        try {
            output = Integer.parseInt(input);
        } catch (NumberFormatException error) {
            System.out.print(outPuts[7]);
            output = -1;
        }
        userInput = output;
    }

    private void checkNumber () {

        if (userInput == generatedNum) {
            System.out.printf(outPuts[5], attempts);
        } else if (userInput < generatedNum) {
            System.out.print(outPuts[3]);
        } else {
            System.out.print(outPuts[4]);
        }
    }

    static String[] outPuts = {
            "Let's play Guess the Number!",
            "Enter the difficulty level (1, 2, or 3): ",
            "I have my number. What's your guess? ",
            "Too low. Guess again: ",
            "Too high. Guess again: ",
            "You got it in %d guesses!\n",
            "Do you wish to play again (Y/N)? ",
            "Invalid entry! Try again: "
    };

}