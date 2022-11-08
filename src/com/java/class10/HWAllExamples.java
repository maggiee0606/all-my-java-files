package com.java.class10;

import java.util.Scanner;

public class HWAllExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println("Please enter 3 digit number from 100-999 only:");
        if (num >= 100 && num <= 999) {
            int a = num / 100;
            num = num % 100;
            int b = num / 10;
            num = num % 10;
            int c = num;
            System.out.println(num * 100 + b * 10 + a);
        } else {
            System.out.println("Invalid number, please use number from 100-999");
        }

    }
}
