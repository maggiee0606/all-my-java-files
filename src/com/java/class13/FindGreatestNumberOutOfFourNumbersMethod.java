package com.java.class13;

import java.util.Scanner;

public class FindGreatestNumberOutOfFourNumbersMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter four numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        int greatest=greatestNumber(num1, num2, num3, num4);
        System.out.println("The greatest number is "+greatest);
    }


    static int greatestNumber(int a, int b, int c, int d) {
        if (a > b && a > c && a > d) {
            return a;
        } else if (b > c && b > d) {
            return b;
        } else if (c > d) {
            return c;
        } else {
            return d;

        }

    }
}

