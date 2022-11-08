package com.java.class12;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OddEvenUsingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First number");
        int num1=sc.nextInt();

        System.out.println("Operator: choose add, sub, mul, div");
        String operator=sc.next();

        System.out.println("Second number");
        int num2= sc.nextInt();

        switch (operator.toLowerCase()){
            case "add":
                add(num1,num2);
                break;

            case "sub":
                sub(num1,num2);
                break;

            case "mul":
                mul(num1,num2);
                break;

            case "div":
                div(num1,num2);
                break;
        }
    }
    static void add (int a, int b){

        System.out.println(a+b);
    }
    static void sub (int a, int b)
    {
        System.out.println(a-b);
    }
    static void mul (int a, int b) {
        System.out.println(a * b);
    }
        static void div(int a , int b){
            System.out.println(a/b);

        }
    }

