package com.java.class06;

import java.util.Scanner;

public class HWTask1Square {
    public static void main(String[] args) {
        /* Write a program to get a number from user and print square of given number.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = scanner.nextInt();
        int square = num * num;
        System.out.println("Square of " + num + "" + " is equal to " + square);


    }
}
