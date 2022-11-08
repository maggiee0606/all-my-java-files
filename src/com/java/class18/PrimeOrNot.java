package com.java.class18;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print number: ");
        int num=sc.nextInt();
        int divisor=0;

        for (int i=1; i<=num; i++){
            if (num%i==0){
                System.out.println(i);
                divisor++;
            }
        }
        if (divisor==2) {
            System.out.println("Prime");
        }else{
            System.out.println("Not a Prime");
        }
        }
    }