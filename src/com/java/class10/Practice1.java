package com.java.class10;

public class Practice1 {
    public static void main(String[] args) {
        int i = 10, j = 10;

        if (i<=10 && j>i ||j<i) {
            j = j + 30;
        }else {
            i = i + 30;   // i = 40
        }
        if (i>j) {
            i=i+j; // true 40>10 //50
        }else{
            j=i+j;  // not true
        }
        System.out.println(i); //50
        System.out.println(j); //10
    }

}
