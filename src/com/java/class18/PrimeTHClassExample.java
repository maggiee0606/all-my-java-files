package com.java.class18;

import java.util.Scanner;

public class PrimeTHClassExample {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
                long num = sc.nextLong();


                calculate(num);
                }


public static void calculate(long number) {
        long multiplication = 1;

        for (long i = number; i>1; i--) {
        multiplication *= i;


        }
        System.out.println(multiplication);
        }
        }
