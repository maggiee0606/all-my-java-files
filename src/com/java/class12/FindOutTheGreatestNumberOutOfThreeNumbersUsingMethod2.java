package com.java.class12;

import java.util.Scanner;

public class FindOutTheGreatestNumberOutOfThreeNumbersUsingMethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("print first number");
        int num1 = sc.nextInt();

        System.out.println("print second number");
        int num2 = sc.nextInt();

        System.out.println("print third number: ");
        int num3 = sc.nextInt();
        maxNumber(num1,num2,num3);
    }
         static void maxNumber(int a, int b, int c){
        if (a>b && a>c) {
            System.out.println(a+"is greatest");
        }else if (b>c) {
            System.out.println(b+ " is greatest");
        }else{
            System.out.println(c+ " is greatest");
        }
    }

}
