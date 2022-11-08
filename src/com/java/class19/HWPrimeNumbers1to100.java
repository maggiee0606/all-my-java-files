package com.java.class19;

public class HWPrimeNumbers1to100 {
    public static void main(StringAndStringMethods[] args) {
        System.out.println("The prime numbers from 1-100: ");

        for (int i = 2; i <= 100; i++) {
            int divisor = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisor++;
                }
            }
            if (divisor == 2) {
                System.out.print(i + " ");
            }
        }
    }
}