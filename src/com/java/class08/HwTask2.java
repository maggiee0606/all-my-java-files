package com.java.class08;

import java.util.Scanner;

//Write a program to calculate the final bill of the customer after giving an appropriate discount based on the amount as follow
//If total amount equal or above 10000 then give 20% discount
//If total amount equal or above 5000 then give 15% discount
//If total amount equal of above 2000 then given 10% discount
//If total amount equal of above 1000 then given 5% discount
//If total amount less than 1000 then 0% discount
//Example
//Input - 2500
//Output - Bill after discount : 2250
//Input - 500
//Output - Bill after discount : 500
public class HwTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The final bill after discount is: ");
        double totalBillAmount = sc.nextDouble();

        double discount20 = totalBillAmount * 0.2;
        double discount15 = totalBillAmount * 0.15;
        double discount10 = totalBillAmount * 0.1;
        double discount5 = totalBillAmount * 0.05;

        if (totalBillAmount >= 10000) {
            System.out.println("Your final bill is " + (totalBillAmount - discount20) + "$");
        } else if (totalBillAmount >= 5000) {
            System.out.println("Your final bill is " + (totalBillAmount - discount15) + "$");
        }else if (totalBillAmount >= 2000) {
            System.out.println("Your final bill is " + (totalBillAmount - discount20) + "$");
        }else if (totalBillAmount >= 1000) {
            System.out.println("Your final bill is " + (totalBillAmount - discount20) + "$");
        }else{
            System.out.println("No discount if amount you spent is less than 1000");
                    }


                }
            }
