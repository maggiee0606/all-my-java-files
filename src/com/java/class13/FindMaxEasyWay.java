package com.java.class13;

import java.util.Scanner;

public class FindMaxEasyWay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter four numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        System.out.println("Greatest number " + findMax(findMax(num1, num2), findMax(num3, num4)));
    }
    static int findMax(int a, int b){
        if (a>b) {
            return a;
        }else{
            return b;
        }
    }
}
