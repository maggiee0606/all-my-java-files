package com.java.class13;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class TemperatureInCConvertToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter temperature in Celsius: ");
        double tempC = sc.nextDouble();
        System.out.println("The temperature in Fahrenheit is " + conversion(tempC));

    }

    static double conversion (double a) {
        return a*9/5+32;
       }
}
