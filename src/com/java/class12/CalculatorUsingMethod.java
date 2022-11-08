package com.java.class12;

import java.util.Scanner;

public class CalculatorUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print first number:");
        int num1 = sc.nextInt();

        System.out.println("Print second number:");
        int num2 = sc.nextInt();

        System.out.println("Please enter you operation");
        String operation = sc.next();

        switch (operation.toLowerCase()) {          //lower case
            case "add":
            case "+":
                add(num1,num2);
                break;

            case "sub":
            case "-":
                sub(num1,num2);
                break;

            case "mul":
            case "*":
                mul(num1,num2);
                break;

            default:
                System.out.println("Error");
        }

        }

    static void add(int a, int b){                //a= could be also num1
        System.out.println(a+b);
    }
    static void sub(int a, int b){
        System.out.println(a-b);
    }
    static void mul(int a, int b) {
        System.out.println(a * b);
    }
}