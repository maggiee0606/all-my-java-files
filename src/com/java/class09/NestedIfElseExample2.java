package com.java.class09;
//Get salary and age from user
//1. If age is less than 18 then print you are not eligible
//2. If age is more than 18 and salary is less than 5000 then print "sorry your need to work hard to get credit card
//3. If age is more than =18 and salary is greater than or = to 5000 print "you are eligible"
//4. If age is more than or equal to 18 and salary is >= to 20000 then print  " you will get free credit card
import java.util.Scanner;

public class NestedIfElseExample2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("What is your age? ");
        int age= sc.nextInt();

        System.out.println("What is your salary? ");
        int salary=sc.nextInt();

        if (age<18) {
            System.out.println("You're not eligible");
        }else{
            if (salary>=20000) {              // this 20000 needs to be first to get this answer instead of 5000
                System.out.println("You will get a free credit card");
            }else{
                if (salary>=5000) {
                    System.out.println("you're eligible");
                }else{
                    System.out.println("You are not eligible");
                }
            }
        }
    }
}
