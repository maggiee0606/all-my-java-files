package com.java.class12;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {

        System.out.println("Input an alphabet: ");
        Scanner sc = new Scanner(System.in);
        String enteredString = sc.next();
        //Check whether input has one letter

        if (enteredString.length() > 1) {
            System.out.println("Input length is longer than 1");
            System.exit(0);
        }
        //convert String to lower case
        char character = enteredString.toLowerCase().charAt(0);

        String result = "";
        //check if char is numeric or alphabetic
        if (Character.isAlphabetic(character)) {

            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                result = "vowel";
            } else {
                result = "consonant";
            }
            System.out.println("Input letter is: " + result);
        }
    }
}
