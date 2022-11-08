package com.java.class07;

public class IfStatement {
    public static void main(String[] args) {
        int num =-8;
        if (num>=0) {
            if (num == 0) {
                System.out.println("zero");
            } else {
                System.out.println(num + " number is positive");
            }
        }else{
            System.out.println(num + " number is negative");
        }

    }
}
