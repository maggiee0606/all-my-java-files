package com.java.class15;

import java.util.Scanner;

public class Homework1019 {
    public static void main(String[] args) {
        System.out.println("=======PrintTheSumOfEvenNumbersFrom1to10=========");

        int sumEven = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sumEven = sumEven + i;
                System.out.println(i);
            }
        }
        System.out.println("The summation of first 10 numbers is equal to " + sumEven);

        System.out.println();
        System.out.println("====PrintTheSumOf1to50NumbersDivisibleBy5or3=====");

        int sum50 = 0;

        for (int a = 1; a <= 50; a++) {
            if (a % 5 == 0 || a % 3 == 0) {
                sum50 = sum50 + a;
                System.out.println(a);
            }
        }
        System.out.println("The sum of the num 1-50 divisible by 5 or 3 is " + sum50);

        System.out.println();
        System.out.println("============PrintSumOf1+2-3+4+5-6+7+8-9+10==============");

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                sum = sum - i;
            } else {
                sum = sum + i;
            }
        }
        System.out.println();
        System.out.println("Sum of 1+2-3+4+5-6+7+8-9+10 is " + sum);

        System.out.println();
        System.out.println("===============PrintEachDigitOfTheNumberIntoSeparateLineInReverseOrder==============");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int num = scanner.nextInt();

        while (num !=0) {
            System.out.println(num % 10);
            num = num / 10;
        }
    }
}

