package com.java.class06;

import java.util.Scanner;

public class TypeCastingExample4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number: ");
        int c = sc.nextInt();

        double average = (a + b + c) / 3;
        System.out.println("Average is: " + average);
    }

}

