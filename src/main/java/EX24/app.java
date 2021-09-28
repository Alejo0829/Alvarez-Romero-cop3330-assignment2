/*
* UCF COP3330 Fall 2021 Assignment 2 Solutions
* Copyright 2021 Rafael Alvarez-Romero
*/

package EX24;
import java.util.Scanner;
public class app {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two strings and I'll tell you if they are anagrams: ");

        System.out.print("Enter the first string: ");
        String firststring = sc.nextLine();

        System.out.print("Enter the second string: ");
        String secondstring = sc.nextLine();

        if(Anagram(firststring, secondstring)){
            System.out.print('"'+ firststring + '"'+ " and " + '"'+secondstring +'"' + " are anagram.");
        }
        else{
            System.out.print('"' + firststring + '"'+ " and " + '"'+secondstring +'"' + " are not anagrams.");
        }
    }

    public static boolean Anagram(String word1, String word2){
        if(word1.length() == word2.length()){
            int[] array1 = new int[26];
            for(int i = 0; i < word1.length(); i++){
                array1[(word1.charAt(i) - 97)]++;
            }
            int[] array2 = new int[26];
            for(int i = 0; i < word2.length(); i++){
                array2[(word1.charAt(i) - 97)]++;
            }
            for(int i = 0; i < word1.length(); i++){
                if(array1[i] != array2[i]){
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
    }
}
