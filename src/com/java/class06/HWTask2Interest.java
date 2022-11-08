package com.java.class06;
import java.util.Scanner;

public class HWTask2Interest {
    public static void main(String[] args) {
        /* Write a program to get principle, rate of interest and number of years from the user
        and calculate simple interest
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter principle in $: ");
        double principle = scanner.nextDouble();
        System.out.println("Enter interest rate in $: ");
        double interestRate =scanner.nextDouble()/100;
        System.out.println("Enter number of years: ");
        double years = scanner.nextDouble();
        double simpleInterest= principle*interestRate*years;
        System.out.println("Simple interest is: $" + simpleInterest );


    }
}
