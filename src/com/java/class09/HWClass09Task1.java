package com.java.class09;

import java.util.Scanner;

//Task #1: Write a program to get a year from the user and check whether it's a leap year or not
//Example
//Input  : Year = 2000
//Output : Leap year

public class HWClass09Task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a year: ");
        int year= sc.nextInt();
        if (year%4==0) {
            System.out.println(year + " is a leap year. ");
        }else {
            System.out.println(year + " is not a leap year. ");
        }


    }
}
