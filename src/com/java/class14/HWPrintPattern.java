package com.java.class14;
//3. Write a Java program to Print Pattern 1 10 2 9 3 8 4 7 5 6
public class HWPrintPattern {
    public static void main(String[] args) {
        int a=1;
        int b=10;

        while (a<=b){
            System.out.print(a + " ");
            System.out.print(b + " ");
                a++;
                b--;
            }
        }

    }
