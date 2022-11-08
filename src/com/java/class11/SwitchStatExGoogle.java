package com.java.class11;

import java.util.Scanner;

// calculate number of days in a particular month
public class SwitchStatExGoogle {
    public static void main(String[] args) {
        System.out.println("please enter a month from 1-12");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();


        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 2:
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            default:
                System.out.println("Enter a number from 1-12");
                break;
        }
    }
}
