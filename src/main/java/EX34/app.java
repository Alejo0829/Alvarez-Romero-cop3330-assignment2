/*
* UCF COP3330 Fall 2021 Assignment 2 Solutions
* Copyright 2021 Rafael Alvarez-Romero
*/
package EX34;
import java.util.Scanner;
public class app {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        employees EX34 = new employees();

        System.out.println("There are 5 employees:");

        EX34.getEmployeeList();

        System.out.print("\nEnter an employee name to remove: ");

        EX34.subtractEmployee(sc.nextLine());
    }
}