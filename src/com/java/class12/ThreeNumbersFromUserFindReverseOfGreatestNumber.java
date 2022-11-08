package com.java.class12;

import java.util.Scanner;

public class ThreeNumbersFromUserFindReverseOfGreatestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("print first number from 100-999");
        int a = sc.nextInt();

        System.out.println("print second number from 100-999");
        int b = sc.nextInt();

        System.out.println("print third number from 100-999");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " is greatest number");
        } else if (b > c) {
            System.out.println(b + " is greatest number");
        } else {
            System.out.println(c + " is greatest number");

            int rev = getReverse(maxNumber(a, b, c));
            System.out.println("The reverse number of the greatest number is: " + rev);
        }
    }

            static int maxNumber(int a, int b, int c) {
            if (a > b && a > c) {
                return a;
            } else if (b > c) {
                return b;
            } else {
                return c;
        }
    }
    static int getReverse(int num){
            int rev = 0;
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
            lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
            lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
            return rev;
        }
    }


