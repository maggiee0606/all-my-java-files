package com.java.class10;

public class PracticeIfElseStatement3 {
    public static void main(String[] args) {
        int i=10, j=5, k=11;
        if (i+1<=k && j <=11) { // simple if
            if (i > k) {
                System.out.println("1");   //nested
            } else if (k > j) {                      // nested

                System.out.println("2");               //nested
            } else {
                System.out.println("3");                 //nested
            }

        }else {
            System.out.println("4");                   //ladder if else
        }
        }
}
