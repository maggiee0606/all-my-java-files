package com.java.class20;

import java.util.Scanner;

// Write a program to take String from user
// Count the number of spaces from the String
//Print String is small if number of spaces less than 5
//Print String is medium if number of spaces >= to 5 and <10
//Print String is large is number of spaces greater than 10
//output: small, medium and large
public class SizeOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String str = sc.nextLine();

        int count =getNumberOfSpaces(str);  // storing count here so we can apply if else
        if (count >10 ) {
            System.out.println("Large");
        } else if (count>=5) {
            System.out.println("Medium");
        } else {
            System.out.println("Small");
        }
    }

    static int getNumberOfSpaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) { //first print each char
            if (str.charAt(i) == ' ') {
                count++;
            }

        }
        System.out.println(count);
            return count;
        }
    }


