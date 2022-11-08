package com.java.class17;

import java.util.Scanner;

public class DiamondHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num / 2 + 1; i++) {

            for (int s = 1; s <= num/2+1-i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("A");
            }

            System.out.println();
        }
        for (int i = 1; i <= num / 2; i++) {
            for (int s = 1; s <= i; s++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= num-(i*2); j++) {
                    System.out.print("A");
                }
                System.out.println();
            }
        }
    }


