package com.java.class07;

import java.util.Scanner;
//Write a program to print a given number that is positive, negative or zero
public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int number = sc.nextInt();

        numberPositive(number);
    }

    static void numberPositive(int num) {

        if (num > 0){
            System.out.println("Number " + num+ " is positive. ");
        } else if(num < 0) {
            System.out.println("Number " + num+ " is negative. ");
        } else {
            System.out.println("Number " + num+ " is ZERO. ");
        }

    }


}
