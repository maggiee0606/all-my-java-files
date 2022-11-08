package com.java.class05;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a =sc.nextInt(), b = sc.nextInt(), c;


        c=b;
        b=a;
        a=c;

        System.out.println(a); //print 20
        System.out.println(b); // print 10
    }
}
