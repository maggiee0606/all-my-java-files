package com.java.class12;

import java.util.Scanner;

public class MaggieRestaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfGuests=0;
        double billAmount=0;
        double taxFee=0;
        boolean isSplit=true;
        double amountPerGuest=0;
        String serviceQuality="";
        double totalAmount=0;
        double totalAmountPerGuest=0;

        System.out.println("Welcome to Maggie's Restaurant!!!");
        System.out.println("Enter number of guests: ");
        numberOfGuests= sc.nextInt();

        System.out.println("Please enter your bill amount: ");
        billAmount=sc.nextDouble();
        taxFee=(billAmount*0.1);

        System.out.println("Is your check split?");
        isSplit=sc.nextBoolean();

        System.out.println("How was restaurant's service? (Options: bad-10%, ok-15%, good-20%, perfect-25%) ");
        serviceQuality= sc.next();
        totalAmount=billAmount+taxFee;

        switch (serviceQuality) {
            case "bad":
                totalAmount = totalAmount + (totalAmount * 0.1);
                break;
            case "ok":
                totalAmount = totalAmount + (totalAmount * 0.15);
                break;
            case "good":
                totalAmount = totalAmount + (totalAmount * 0.2);
                break;
            case "perfect":
                totalAmount = totalAmount + (totalAmount * 0.25);
                break;
        }

        if(isSplit){
            totalAmountPerGuest=totalAmount/numberOfGuests;
            System.out.println("NumberOfGuests  " +numberOfGuests);
            System.out.println("TotalAmount  "+totalAmount);
            System.out.println("TotalAmountPerGuest  " +totalAmountPerGuest);

        }else{
            System.out.println("NumberOfGuests: "+numberOfGuests);
            System.out.println("TotalAmount" +totalAmount);
        }
    }
}