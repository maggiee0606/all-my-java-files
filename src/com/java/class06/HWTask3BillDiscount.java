package com.java.class06;
import java.util.Scanner;

public class HWTask3BillDiscount {
    public static void main(String[] args) {
        /*Write a program to take total bill amount and
         discount percentage from user and print value of final bill amount after discount
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is you total bill in $: ");
        double num = scanner.nextDouble();
        System.out.println("What is you discount in %: ");
        double discount = scanner.nextDouble()/100;
        double finalBill= num - (num*discount);
        System.out.println("Your final bill is : $" + finalBill);

    }
}
