package com.java.class08;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Please enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Please choose your operation: ");
        System.out.println("1.Addition: ");
        System.out.println("2.Subtraction: ");
        System.out.println("3.Multiplication: ");
        System.out.println("4.Division: ");
        int operation = sc.nextInt();
        calculation(operation, num1, num2);
    }

    static void calculation (int operation, int num1, int num2){
        if (operation == 1) {
            System.out.println(num1 + num2);
        } else if (operation == 2) {
            System.out.println(num1 - num2);
        } else if (operation == 3) {
            System.out.println(num1 * num2);
        } else if (operation == 4) {
            System.out.println(num1 / num2);
        }else{
            System.out.println("Invalid");
    }
}}

       /* if (marks >= 101) {
            System.out.println("Please enter valid marks (0-100)");
        } else if (marks <= -1) {
            System.out.println("Please enter valid marks (0-100)");
        } else if (marks >= 90) {
            System.out.println("A+");
        } else if (marks >= 80) {
            System.out.println("A");
        } else if (marks >= 70) {
            System.out.println("B+");
        } else if (marks >= 60) {
            System.out.println("B");
        } else if (marks >= 50) {
            System.out.println("C+");
        } else if (marks >= 40) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }//else block ends here
    }//main method ends here  (curly bracket)
}//class ends here (curly bracket)
// 0 - fail*/