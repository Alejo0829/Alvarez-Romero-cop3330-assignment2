/*
* UCF COP3330 Fall 2021 Assignment 2 Solutions
* Copyright 2021 Rafael Alvarez-Romero
*/

package EX30;

public class app {
    public static void main(String[] args) {

        int a = 1, b = 12;

        for (int i = a; i <= b; i++ ) {

            for (int j = 1; j <=b ; j++) {

                System.out.printf("%5d", (i*j));
            }
            System.out.println();
        }
    }
}