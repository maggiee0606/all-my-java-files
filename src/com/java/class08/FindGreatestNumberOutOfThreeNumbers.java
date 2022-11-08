package com.java.class08;

import java.util.Scanner;

public class FindGreatestNumberOutOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Please enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Please enter third number: ");
        int num3 = sc.nextInt();

    if (num1>num2 && num1>num3){
    System.out.println("Greatest number is " + num1);
    }else if (num2>num3){
    System.out.println("Greatest number is " + num2);
    }else{
    System.out.println("Greatest number is " + num3);
    }
    }
    }
//if (marks > 100) {
//            System.out.println("Please enter valid marks (0-100)");
//        } else if (marks < 0) {
//            System.out.println("Please enter valid marks (0-100)");
//        } else if (marks >= 90) {
//            System.out.println("A+");
//        } else if (marks >= 80) {
//            System.out.println("A");
//        } else if (marks >= 70) {
//            System.out.println("B+");
//        }