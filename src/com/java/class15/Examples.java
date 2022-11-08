package com.java.class15;

import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        //Write a program to print numbers from 1-10:
        System.out.println("===================NumbersFrom1to10========================");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("===========CalculateSumOfFirst10NaturalNumber=============");
        int result = 1;
        for (int i = 1; i <= 10; i++) {
            result = result * i;
        }
        System.out.println(result);
        System.out.println();
        System.out.println("=====PromptUserToInputInteger.ThenPrintMultiplicationTableOfThatNumber====");

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Please enter a whole positive number: ");
        num = sc.nextInt();
        System.out.println("Multiplication table of " + num);

        for (int i = 1; i <= 3; i++) {
            System.out.println(num + "*" + i + "=" + num * i);
        }
        System.out.println();
        System.out.println("========FindFactorialValueOfAnyNumberEnteredThroughKeyboard================");
        Scanner scanner = new Scanner(System.in);
        int num1;
        int fact = 1;
        System.out.println("Please enter any number on keyboard");
        num1 = scanner.nextInt();


        for (int i = 1; i <= num1; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
        System.out.println();
        System.out.println("=======TwoNumberFromUserFindValueOfOneNumberRaisedToPowerOfAnother==========");
        Scanner Maggie = new Scanner(System.in);
        int a;
        int b;
        int result1 = 1;
        System.out.println("Please enter one number:");
        a = Maggie.nextInt();
        System.out.println("Please enter second number:");
        b = Maggie.nextInt();

        for (int i = 1; i <= b; i++){
        result1 = result1 * a;
    }
        System.out.println("Result " + result1);
    }

}
