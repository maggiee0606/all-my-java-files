package com.java.class21;

import java.util.Scanner;

public class ReverseStringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str=sc.nextLine().toLowerCase().replaceAll("\\s+", "");

        String reverse ="";

        for (int i=str.length()-1; i>=0;i--){
            reverse=reverse + str.charAt(i);
        }
        if (str.equals(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
        }
        }
