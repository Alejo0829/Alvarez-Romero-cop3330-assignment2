/*
* UCF COP3330 Fall 2021 Assignments 2 Solutions
* Copyright 2021 Rafael Alvarez-Romero
*/
package EX39;
import java.util.*;
public class employeerecords {
    String[] employee1 =  {"John Johnson", "Manager", "2016-12-31"};
    String[] employee2 = {"Tou Xiong", "Software Engineer", "2016-10-05"};
    String[] employee3 = {"Jake Jacobson", "Programmer", ""};
    String[] employee4 = {"Jacquelyn Jackson", "DBA", ""};
    String[] employee5 = {"Sally Webber", "Web Developer", "2015-12-18"};
    String[] employee6 = {"Michaela Michaelson", "District Manager", "2015-12-19"};

    ArrayList<TreeMap<Integer, String>> employeeArray = new ArrayList<>();

    public void setEmployee(String[]...arrays) {

        for (String[] array: arrays) {

            TreeMap<Integer, String> employeeMap = new TreeMap<>();

            for (int i = 0; i < array.length; i++) {

                employeeMap.put(i, array[i]);
            }
            employeeArray.add(employeeMap);
        }
    }

    public employeerecords() {
        setEmployee(employee1, employee2, employee3, employee4, employee5, employee6);

        printOrderArray(sortNames(employeeArray));

    }

    private ArrayList<String> sortNames(ArrayList<TreeMap<Integer, String>> array) {

        ArrayList<String> Names = new ArrayList<>();

        array.forEach((TreeMap<Integer, String> TreeMap) -> Names.add(TreeMap.get(1)));

        Collections.sort(Names);

        return Names;

    }

    private void printOrderArray(ArrayList<String> array) {
        ArrayList<TreeMap<Integer, String>> reorderArray = new ArrayList<>();

        array.forEach(string -> {
            for (TreeMap<Integer, String> integerStringTreeMap : employeeArray) {
                if (integerStringTreeMap.get(1).equals(string)) {
                    reorderArray.add(integerStringTreeMap);
                }
            }
        });

        String printFormat = ("%-20s | %-18s | %-1s\n");

        System.out.printf("\n%-20s | %-18s | %-1s\n", "Name", "Job", "Separation Date");
        System.out.print("-----------------------------------------------------------\n");


        for (TreeMap<Integer, String> employeeTreeMap : reorderArray) {

            System.out.printf(printFormat, employeeTreeMap.get(0), employeeTreeMap.get(1), employeeTreeMap.get(2), employeeTreeMap.get(3));

        }

    }

}
