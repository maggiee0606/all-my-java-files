package com.java.class16;
import java.util.Scanner;
//Write a program to print greatest digit from the given number
//input: 367678
//output: 8 -greatest digit
public class GreatestDigitFromGivenNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please print a number: ");
        int num=sc.nextInt();
        int lastDigit = 0;
        int greatest=num%10;

        while (num>0){

            lastDigit=num%10;

            if (lastDigit>greatest) {
                greatest = lastDigit;
            }
            num=num/10;
            }

        System.out.println(greatest);
    }

}
