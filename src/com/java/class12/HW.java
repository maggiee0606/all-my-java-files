package com.java.class12;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first number 100-999: ");
        int num1 = sc.nextInt();

        System.out.println("Please enter second number 100-999: ");
        int num2 = sc.nextInt();

        System.out.println("Please enter third number 100-999: ");
        int num3 = sc.nextInt();

//        if (num1>num2 && num1>num3) {
//            System.out.println(num1 + " is the greatest number.");
//        }else if (num2>num3) {
//            System.out.println(num2 + "is the greatest number. ");
//        }else{
//            System.out.println(num3 + "is the greatest number");

            int rev = getReverse(maxNumber(num1,num2,num3));
        System.out.println("reverse number is " + rev);
        }

    static int maxNumber(int a, int b, int c){
        if (a>b && a>c) {
            return a;
        }else if (b>c) {
            return b;
        }else{
            return c;
        }
    }
    static int getReverse(int num) {
        int rev = 0;
        int lastDigit = num % 10;

        rev=rev*10+lastDigit;
        num=num/10;
        lastDigit=num%10;

        rev=rev*10+lastDigit;
        num=num/10;
        lastDigit=num%10;

        rev=rev*10+lastDigit;
        num=num/10;


        return rev;
    }
    }
