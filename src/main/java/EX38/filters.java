/*
* UCF COP3330 Fall 2021 Assignment 2 Solutions
* Copyright 2021 Rafael Alvarez-Romero
*/
package EX38;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class filters {
    private final Scanner sc = new Scanner(System.in);

    private String input;

    private final ArrayList<String> output = new ArrayList<>();

    public filters() {

        getInput();
        setOutput(input);
        input = filterEvenNumbers(output);
        setOutput(input);
        printAll();

    }

    private void printAll() {

        String printEven = "The even numbers are ";

        String stringOut =
                printEven + output.toString()
                        .replace("[", "")
                        .replace(",","")
                        .replace("]", ".");

        System.out.println(stringOut);
    }

    private void getInput() {
        System.out.print("Enter a list of numbers, separated by spaces: ");
        input = sc.nextLine();
    }

    private void setOutput(String input) {

        output.clear();
        output.addAll(Arrays.asList((input.split(""))));

    }

    private String filterEvenNumbers(ArrayList<String> array) {

        StringBuilder sorted = new StringBuilder();
        int integer;

        for (String item: array) {

            try {

                integer = Integer.parseInt(item);

                if (integer % 2 == 0) {
                    sorted.append(item);
                }

            } catch (NumberFormatException ignore) {}
        }
        return sorted.toString();
    }
}