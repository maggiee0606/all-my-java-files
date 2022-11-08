package com.java.class18;

import java.util.Scanner;

//Palindrome 3773 reverse number same number
//13231 -yes
//Write a program to check given number is palindrome or not
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num=sc.nextInt();
        int backUpNum=num;
        int rev=0;

        while (num > 0) {
            int lastDigit=num%10;
            num=num/10;
            rev=rev*10+lastDigit;
        }
        if (rev==backUpNum) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
        }

    }