/*
* UCF COP3330 Fall 2021 Assignment 2 Solutions
* Copyright 2021 Rafael Alvarez-Romero
*/
package EX34;
import java.util.ArrayList;
import java.util.Arrays;

public class employees {
    private ArrayList<String> employeeList = new ArrayList<>(Arrays.asList(
            "John Smith",
            "Jackie Jackson",
            "Chris John",
            "Amanda Cullen",
            "Jeremy Goodwin"
    )
    );

    private boolean checkEmployee(String input) {

        for (String employee : employeeList) {
            if (input.equals(employee)) return true;
        }
        return false;
    }

    public void getEmployeeList() {
        for (String item : employeeList) {
            System.out.println(item);
        }
    }

    public int getListSize() {
        return employeeList.size();
    }

    public void addEmployee(String input) {

        employeeList.add(input);

    }

    public void subtractEmployee(String input) {

        if (checkEmployee(input)) {
            employeeList.remove(input);
        }else {
            System.out.println("\nThat employee does not exist.\n");
        }
        System.out.printf("There are %d employees: \n", getListSize());
        getEmployeeList();
    }
}