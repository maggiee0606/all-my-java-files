package com.java.class07;

import java.util.Scanner;

//write a program to print the number of days in a given month.
//Input 3 (March) output 31
public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter one of the months as a number from 1-12: ");
        int month = sc.nextInt();
numberDaysInMonth(month);
    }
    static void numberDaysInMonth(int month) {

            if (month == 1) {
                System.out.println("January -31 days");
            } else if (month == 2) {
                System.out.println("February -28 days");
            } else if (month == 3) {
                System.out.println("March- 31 days");
            } else if (month == 4) {
                System.out.println("April - 30 days");
            } else if (month == 5) {
                System.out.println("May - 31 days");
            } else if (month == 6) {
                System.out.println("June - 30 days");
            } else if (month == 7) {
                System.out.println("July - 31 days");
            } else if (month == 8) {
                System.out.println("August - 31 days");
            } else if (month == 9) {
                System.out.println("September - 30 days");
            } else if (month == 10) {
                System.out.println("October - 31 days");
            } else if (month == 11) {
                System.out.println("November - 30 days");
            } else if (month == 12) {
                System.out.println("December - 31 days");
            } else {
                System.out.println("Error");

            }
        }
    }



