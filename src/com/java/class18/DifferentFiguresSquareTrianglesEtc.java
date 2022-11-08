package com.java.class18;

public class DifferentFiguresSquareTrianglesEtc {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("====================================");

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("====================================");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("======================================");
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }
        System.out.println("=========================================");

        for (int i=1; i<=5; i++){
            for (int s=1; s<=i; s++){
                System.out.print("  ");
            }
            for (int j=i; j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("========================================");
        for (int i=1; i<=5; i++){
            for (int s=i; s<=5;s++){
                System.out.print("  ");
            }
            for (int j=1; j<i; j++){
                System.out.print("* ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("===========================================");
        for (int i=1; i<=5;i++){
            for (int s =1; s<=i;s++){
                System.out.print("  ");
            }
            for (int j=i; j<5;j++) {
                System.out.print("* ");
            }
            for (int j=i; j<=5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}