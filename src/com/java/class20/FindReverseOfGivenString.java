package com.java.class20;

import java.util.Scanner;
//input: Chirag Khiamni
//output: inmaihK garihC
public class FindReverseOfGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String str = sc.nextLine();

        for (int i=0; i<str.length();i++){
            System.out.print(str.charAt(str.length()-1-i));
        }

        }
}
