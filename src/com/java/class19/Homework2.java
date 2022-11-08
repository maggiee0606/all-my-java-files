package com.java.class19;

public class Homework2 {
    public static void main(StringAndStringMethods[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 4 && i % 4 == 3 && i % 3 == 2 && i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}