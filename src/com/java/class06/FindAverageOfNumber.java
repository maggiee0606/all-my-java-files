package com.java.class06;

import java.util.Scanner;

public class FindAverageOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number" );
        int a = sc.nextInt();
        System.out.println("Please enter first number" );
        int b = sc.nextInt();
        System.out.println("Please enter first number" );
        int c = sc.nextInt();
        double result = (a+b+c)/3; // for average use double it will give you decimal places
        System.out.println("average is " + result);
    }
}
