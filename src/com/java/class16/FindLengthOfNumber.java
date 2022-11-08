package com.java.class16;

import java.util.Scanner;
import java.util.logging.Level;

//Write a program to print length of given number
public class FindLengthOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please print a number, and I will let you know the length of it: ");
        int num=sc.nextInt();

        int length=0;
        while (num!=0){
            num=num/10;
            length++;
        }

        System.out.println("The length of your number is " + length);
        

    }

    }
