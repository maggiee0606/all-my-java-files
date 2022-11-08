package com.java.class11;

import java.util.Scanner;

//Write a program to get month number from user and print number of days in the given month (1-12 only)
//Ex: input-1
//output-31 days
//input-2
//output-28/29 days
//input-11
//output-30 day
public class FindNumOfDaysInMonthDuplicateCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println("Please enter a number from 1-12 representing a month: ");

        switch(num){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28/29 days");
                break;
            case 4:
            case 6:
                System.out.println("30 days");
                break;
            case 9:
                System.out.println("30 days");
                break;
            case 10:
                System.out.println("31 days");
                break;
            case 11:
                System.out.println("30 days");
                break;
            case 12:
                System.out.println("31 days");
            default:
                System.out.println("Please enter number from 1-12. Thank you");

        }

    }
}
