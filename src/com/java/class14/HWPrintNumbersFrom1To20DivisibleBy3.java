package com.java.class14;
//Write a program to print numbers from 1 to 20 which are divisible by3

public class HWPrintNumbersFrom1To20DivisibleBy3 {
    public static void main(String[] args) {
        int i=3;

        while (i<20){
            if (i%3==0)
            System.out.println(i);
            i++;
        }
    }
}
