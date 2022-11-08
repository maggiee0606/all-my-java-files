package com.java.class06;

import java.util.Scanner;

public class ConvertAgeToDaysMonthsMinutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How young are you: ");
        int age = sc.nextInt();

        System.out.println("You have spent " + age*12 + " months on Earths");
        System.out.println("You have spent " + age*365+ " days on Earths");
        System.out.println("You have spent " + age*12*365*24*60 + " minutes on Earths");

    }
}

