package com.java.class08;
//Task1: Write a program to take number from user and print if it's divisible by 5 or not
//Example
//Input - 6
//Output - Not divisible
//Input - 35
//Output - Divisible
import java.util.Scanner;

public class HwTask1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();

        if (num%5==0) {
            System.out.println("This number is divisible by 5 ");
        } else{
            System.out.println("This number is not divisible by 5 ");
        }

    }
}
