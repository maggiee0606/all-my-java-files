package com.java.class11;

import java.util.Scanner;

public class SwitchStatExGoogle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Please enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Do you want to add, sub, mul, div or mod? ");
        String operation = sc.next();

        switch (operation.toLowerCase()) {
            case "add":
            case "+":
                System.out.println(num1 + num2);
                break;
            case "sub":
                System.out.println(num1 - num2);
                break;
            case "mul":
                System.out.println(num1 * num2);
                break;
            case "div":
                System.out.println(num1 / num2);
                break;
            case "mod":
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Not a valid operation.");


        }


    }
}
