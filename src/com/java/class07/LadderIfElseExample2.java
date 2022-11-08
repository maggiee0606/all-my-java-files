package com.java.class07;

import java.util.Scanner;
//Write a program to take marks from the user and print
// grade as follow
//Mark is between 90 to 100 then print A+
//Mark is between 80-89 print A
//Mark is 70-79 then print B+
//Mark is 60-69 then print B
//Mark is 50-59 then print C+
//Mark is 40-49 then print C
//Mark is below 40 then print Fail

public class LadderIfElseExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter you mark ");
        int mark = sc.nextInt();
        if (mark >= 101) {
            System.out.println("Error");
        }else if  (mark >= 90) {
                System.out.println("A+");
            } else if (mark >= 80){
                System.out.println("A");
        } else if (mark >= 70) {
            System.out.println("B+");
        } else if (mark >= 60) {
            System.out.println("B");
        } else if (mark >= 50) {
            System.out.println("C+");
        } else if (mark >= 40) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }}}
