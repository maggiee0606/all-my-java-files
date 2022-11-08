package com.java.class12;

import java.util.Scanner;

public class CalculatorUsingMethod1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("print first number: ");
        int num1= sc.nextInt();

        System.out.println("print second number");
        int num2= sc.nextInt();

        System.out.println("What are you trying to do add, sub, mul? ");
        String operation=sc.next();
        switch (operation.toLowerCase()){
            case "add":
            case "+":
                add(num1,num2);
            case "sub":
            case "-":
                sub(num1,num2);
            case "mul":
            case "*":
                mul(num1,num2);
        }

    }
    static void add(int a, int b){
        System.out.println(a+b);

    }
    static void sub(int a, int b){
        System.out.println(a-b);
    }
    static void mul (int a, int b){
        System.out.println(a*b);
    }
}
