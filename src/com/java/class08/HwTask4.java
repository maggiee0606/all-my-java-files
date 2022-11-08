package com.java.class08;
//Write a program to check given character is a vowel or not
//Vowel characters are - a, e, i, o, u
//Please refer to the below link to check how to get char using scanner class in java
//Get Character In Java Using Scanner.
//Example
//Input - c
//Output - Not Vowel
//Input - a
//Output - Vowel
import java.util.Scanner;

public class HwTask4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Please type a character to check if it is a vowel or not ");
        char ch = sc.next().charAt(0);

        if (ch=='a' || ch=='e'||ch=='i'||ch=='0'||ch=='u'){
            System.out.println("The character is a vowel");
        }else {
            System.out.println("The character you used is not a vowel");
        }
    }
}
