package com.java.class20;
//write a program to print the length of the String without using the .length() function
//Example = Java is Great
//Output= 13
import java.util.Scanner;

public class FindLengthOfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a sentence. ");
        String string= sc.nextLine();
        System.out.println();
         int count=0;


         while (!string.isEmpty()){
             count++;
             string=string.substring(1);
         }
        System.out.println(string.substring(14));
        System.out.println(count);





    }
}
