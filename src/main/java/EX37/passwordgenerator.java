/*
* UCF COP3330 Fall 2021 Assignment 2 Solutions
* Copyright 2021 Rafael Alvarez-Romero
*/
package EX37;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class passwordgenerator {
    private final Scanner sc = new Scanner(System.in);

    private final ArrayList<String> characters = new ArrayList<>(Arrays.asList(
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ",
            "0123456789",
            "!@#$%^&*"
    ));

    private final String[] outputStrings = {
            "What's the minimum length? ",
            "How many special characters? ",
            "How many numbers? ",
            "Your password is "
    };

    public passwordgenerator() {

        int[] inputs = new int[3];

        do {

            getValues(inputs);

            if (!(enoughLetters(inputs))) System.out.println(outputStrings[3]);

        } while (!(enoughLetters(inputs)));

        inputs[0] -= (inputs[1]+inputs[2]);

        generatePassword(inputs);

    }

    private void getValues(int[] inputArray) {

        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(outputStrings[(i)]);
            inputArray[i] = sc.nextInt();
        }
    }

    protected boolean enoughLetters(int[] inputArray) {
        return (inputArray[0] / (inputArray[1] + inputArray[2]) >= 2);
    }

    private void generatePassword(int[] inputArray) {

        System.out.print(outputStrings[3]);

        ArrayList<String> stringArray;

        for (int i = 0; i < inputArray.length; i++) {

            stringArray = new ArrayList<>( Arrays.asList(characters.get(i).split("")));

            for (int j = 0; j < inputArray[i]; j++) {
                System.out.print(stringArray.get(((int) (Math.random() * (stringArray.size())))));
            }

            stringArray.clear();
        }
    }
}