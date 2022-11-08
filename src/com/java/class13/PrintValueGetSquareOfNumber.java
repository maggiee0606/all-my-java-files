package com.java.class13;

public class PrintValueGetSquareOfNumber {
    public static void main(String[] args) {


        printValue(getSquareOfNumber(10));
    }
    static int getSquareOfNumber(int a){

        return getMultiplication(a-a,a+5);
    }
    static int getMultiplication(int a, int b){

        return a*b;
    }
    static void printValue(int num){
        System.out.println(num);
    }
}
