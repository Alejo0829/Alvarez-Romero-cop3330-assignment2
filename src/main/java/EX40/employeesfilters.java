/*
* UCF COP3330 Fall 2021 Assignment 2 Solutions
* Copyright 2021 Rafael Alvarez-Romero
*/
package EX40;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class employeesfilters {
    String[] employee1 =  {"John", "Johnson", "Manager", "2016-12-31"};
    String[] employee2 = {"Tou", "Xiong", "Software Engineer", "2016-10-05"};
    String[] employee3 = {"Jake", "Jacobson", "Programmer", ""};
    String[] employee4 = {"Jacquelyn", "Jackson", "DBA", ""};
    String[] employee5 = {"Sally", "Webber", "Web Developer", "2015-12-18"};
    String[] employee6 = {"Michaela", "Michaelson", "District Manager", "2015-12-19"};

    ArrayList<TreeMap<Integer, String>> employeeArray = new ArrayList<>();

    final Scanner sc = new Scanner(System.in);

    private void setEmployee(String[]...arrays) {

        System.out.print("Enter a search string: ");

        String input = sc.nextLine();

        for (String[] array: arrays) {

            for (int i = 0; i < array.length; i++) {

                if (array[i].contains(input)){

                    TreeMap<Integer, String> employeeMap = new TreeMap<>();

                    for (int j = 0; j < array.length; j++) {

                        employeeMap.put(j, array[j]);
                    }
                    employeeArray.add(employeeMap);
                    i = array.length;
                }
            }
        }
    }

    private void printResults() {

        if (employeeArray.isEmpty()) {
            System.out.println("No matches.");
            return;
        }

        String pForm = ("%-20s | %-18s | %-1s\n");

        System.out.printf("\n%-20s | %-18s | %-1s\n", "Name", "Job", "Separation Date");
        System.out.print("-----------------------------------------------------------\n");


        for (TreeMap<Integer, String> TreeMap : employeeArray) {

            String name = TreeMap.get(0) + " " + TreeMap.get(1);

            System.out.printf(pForm, name, TreeMap.get(2), TreeMap.get(3));
        }
    }
    public employeesfilters() {
        setEmployee(employee1, employee2, employee3, employee4, employee5, employee6);
        printResults();
    }
}
