/*
* UCF COP3330 Fall 2021 Assignment 2 Solutions
* Copyright 2021 Rafael Alvarez-Romero
*/
package EX36;
import java.util.ArrayList;
import java.util.Scanner;
public class computing {
    private final Scanner sc = new Scanner(System.in);
    private final ArrayList<Double> inputs = new ArrayList<>();
    private double average, minimum = Double.MAX_VALUE, maximum = Double.MIN_VALUE, deviation, stdev;

    String printThis = """
			The average is: %.1f\s
			The minimum is: %.0f\s
			The maximum is: %.0f\s
			The Standard Deviation is: %.2f
			""";

    public computing() {

        setInputs();
        setAverage();
        setMinimum();
        setMaximum();
        setStdev();
        getCalculations();
    }

    private void setInputs() {

        String input = "";
        double output;

        do {

            System.out.print("Enter a number: ");

            try {

                input = sc.nextLine();

                if (input.equals("") || input.isEmpty()) continue;

                if (!(input.equals("done"))) {
                    output = Double.parseDouble(input);
                    inputs.add(output);
                }
            } catch (NumberFormatException ignored) {}

        } while (!input.equals("done"));
    }

    private void setAverage() {

        inputs.forEach((input) -> average += input);
        average /= inputs.size();
    }

    private void setMinimum() {

        inputs.forEach((input) ->  {
            if (minimum > input) minimum = input;
        });
    }

    private void setMaximum() {

        inputs.forEach((input) -> {
            if(maximum < input) maximum = input;
        });
    }

    private void setStdev() {

        inputs.forEach(input -> deviation += Math.pow(input-average, 2));

        stdev = Math.sqrt(deviation/inputs.size());
    }

    private void getCalculations() {

        System.out.print("The numbers are: ");

        inputs.forEach((e) -> {

            if (inputs.indexOf(e) != inputs.size()-1) {
                System.out.printf("%.0f, ", e);
            } else {
                System.out.printf("%.0f\n", e);
            }

        });

        System.out.printf(printThis, average, minimum, maximum, stdev);
    }
}