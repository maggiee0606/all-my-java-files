package com.java.class07;

import java.util.Scanner;

//Write a program to take age from user and print weather they are eligible for driver license or not
public class IfElseExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you? ");
        int age = sc.nextInt();
        int eligibleDL=16;
        isEligible(eligibleDL);

    }
static void isEligible(int age){

        if (age >= 16) {
            System.out.println("You are eligible for driver license ");
        } else {
            System.out.println("You are not eligible for DL");
        }
    }
}
