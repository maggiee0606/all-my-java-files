package com.java.class09;

import java.util.Scanner;

public class FindGreatestNumberOutOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Please enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Please enter third number: ");
        int num3 = sc.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("First number is greatest " + num1);

            } else {
                System.out.println("greatest " + num3);
            }
        } else {

            if (num2 > num3) {
                System.out.println("This is your greatest number" + num2);

            } else {
                System.out.println("This is your greatest number " + num3);
            }
        }
    }
}