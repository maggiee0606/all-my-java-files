package com.java.class11;
// write a program to design calculator using Switch Statements (add, sub, mul, div,mod)
//input=10, 20, Add
//output 30
//input=30, 10 mul
//output 300

import java.util.Scanner;

public class SwitchExample3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your first number: ");
        int num1=sc.nextInt();

        System.out.println("Please enter your operation:");
        String operator=sc.next();

        System.out.println("Please enter your second number:");
        int num2=sc.nextInt();

        switch (operator) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "%":
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Please enter valid operator: add, sub, div, mult, mod.");

        }
        }

    }
