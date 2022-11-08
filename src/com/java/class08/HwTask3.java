package com.java.class08;
// Write a program to print messages based on the rating of the company
//For Example,
//rating is 5 then print Very Good
//rating is 4 then print Good
//rating is 3 then print Average
//rating is 2 then print Poor
//rating is 1 then print Very Poor
import java.util.Scanner;

public class HwTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Please rate your company using numbers from 1-5 only. ");

        int rating = sc.nextInt();
        if (rating == 5) {
            System.out.println("Very Good");
        } else if (rating == 4) {
            System.out.println("Good");
        } else if (rating == 3) {
            System.out.println("Average");
        } else if (rating == 2) {
            System.out.println("Poor");
        }else if (rating==1) {
            System.out.println("Very Poor");
        }else{
            System.out.println("Please enter number from 1-5");

        }
    }
}
