package com.java.class11;

import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1");
        int num1 = sc.nextInt();

        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        System.out.println("Please enter you operation");
        String operation = sc.next();

        switch (operation.toLowerCase()) {          //lower case
            case "add":
            case "+":
                System.out.println(num1 + num2);
                break;

            case "sub":
            case "-":
                System.out.println(num1 - num2);
                break;

            case "mul":
            case "*":
                System.out.println(num1 * num2);
                break;

            case "div":
            case "/":
                System.out.println(num1 / num2);
                break;

            case "mod":
            case "%":
                System.out.println(num1 % num2);
                break;

            default:
                System.out.println("Error");

        }
    }
}
