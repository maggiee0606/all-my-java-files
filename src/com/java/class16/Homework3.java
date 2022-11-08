package com.java.class16;

//Java program to find result of 1/2 + 2/3 + 3/4 + 4/5 +......10/11
public class Homework3 {
    public static void main(String[] args) {
        double  sum = 0;
        double  n;
        double d;


        for (n=1, d=2; n<=10 || d<=11;n++,d++){
            sum=sum+(n/d);
        }
        System.out.println(sum);
    }
}
