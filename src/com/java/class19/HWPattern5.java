package com.java.class19;

public class HWPattern5 {
    public static void main(StringAndStringMethods[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int s = 5 - i; s >= 1; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (i % 2 != 0) {
                    System.out.print(1);
                } else
                    System.out.print(0);
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            for (int j = 5 - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = i * 2 - 1; j >= 1; j--) {
                if (i % 2 != 0) {
                    System.out.print(1);
                } else
                    System.out.print(0);
            }
            System.out.println();
        }
    }
}
