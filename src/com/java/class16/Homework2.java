package com.java.class16;

//2.  Java program to find result of 10 + 1 + 9 + 2 + 8 + 3 + 7 + 4 + 6 + 5
public class Homework2 {
    public static void main(String[] args) {

        int result1 = 0;
        for (int i = 10; i >=6; i--) {
            result1 = result1 + i;

        }
        int result2=0;
        for (int j=1; j<=5;j++){
            result2=result2+j;

        }
        System.out.println(result1+result2);
    }
}
