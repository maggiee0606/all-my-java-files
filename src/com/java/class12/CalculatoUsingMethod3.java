package com.java.class12;

import java.util.Scanner;

public class CalculatoUsingMethod3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter whole number: ");
        int num = sc.nextInt();
        oddEven(num);

    }
    static void oddEven(int num){
        if (num%2==0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }
}
