package com.java.class18;

import java.util.Scanner;

public class FindFactorialOfGivenNum {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        {
            Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.println(i);
                }
            }

        }
    }
    }

