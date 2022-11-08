package com.java.class12;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfGuests = 0;
        double billAmount = 0;
        double tip = 0;
        boolean isSplit = false;
        String serviceQuality = "";
        double totalAmount = 0;
        double totalAmountPerGuest = 0;


        System.out.println("Welcome to Jolie's Restaurant!!!");

        System.out.println("Please enter number of guests: ");
        numberOfGuests = sc.nextInt();

        System.out.println("Please enter a restaurant bill amount: ");
        billAmount = sc.nextDouble();

        System.out.println("Would you like to provide check together or split? true/false ");
        isSplit = sc.nextBoolean();

        System.out.println("How was restaurant's service? (Options: bad-10%, ok-15%, good-20%, perfect-25%)");
        serviceQuality = sc.next();

        if (serviceQuality.equals("bed")) {
            tip = 0.10;
        } else if (serviceQuality.equals("ok")) {
            tip = 0.15;
        } else if (serviceQuality.equals("good")) {
            tip = 0.20;
        } else if (serviceQuality.equals("perfect")) {
            tip = 0.25;
        }

        System.out.println("Total amount");
        totalAmount = billAmount + (billAmount * 0.10)*tip;

        totalAmountPerGuest = totalAmount / numberOfGuests;
        System.out.println(("Total per quest" + totalAmountPerGuest));

    }


}



