package com.java.class09;
//Write a program to reads power consumed in units and print the amount to be paid by the customer
//  Consumption   Rate of Units Charges are as follows
//  ------------------------------------------------------
//  If unit is 0-200       Rs.0.50 per unit
//  If unit is 201-400     Rs.100 plus Rs.0.65 per unit
//  If unit is 401-600     Rs.230 plus Rs.0.80 per unit
//  -------------------------------------------------------
import java.util.Scanner;

public class HWClass09Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("What is power consumed in units, please give a number from 0-600");
        double unit = sc.nextDouble();

        if (unit >= 0 && unit <= 200) {
            System.out.println("You will have to pay " + (unit * 0.5) + " $");
        } else if (unit >= 201 && unit <= 400) {
            System.out.println("You will have to pay " + ((unit * 0.65) + 100) + " $");
        } else if (unit >= 401 && unit <= 600) {
            System.out.println("You are responsible to pay " + ((unit * 0.8) + 230) + " $");
        } else
            System.out.println("Please enter valid number: 0-600");
    }

    }

