package com.java.class21;

import java.util.Scanner;

public class Revision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str= sc.nextLine().toLowerCase();
        String reverse="";
        String backUp=str;
        for (int i=0; i<str.length(); i++){
            reverse =reverse+str.charAt(i);
        }
        if (backUp.equals(reverse)) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
