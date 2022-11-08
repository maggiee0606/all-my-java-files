package com.java.class16;

import java.util.Scanner;

//4.  Write a program to find factors of the given number
//Input - 6
//Output - 1 2 3 6
public class Homework4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {


                System.out.println(i);
            }
        }
    }}
