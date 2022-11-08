package com.java.class19;

//Write a program to find a magic number from 1 to 100,
//if you divide that number by 5 you will get remainder 4
//if you divide that number by 4 you will get remainder 3
//if you divide that number by 3 you will get remainder 2
//if you divide that number by 2 you will get remainder 1
public class HWMagicNumber {
    public static void main(StringAndStringMethods[] args) {
       int magicNum=0;

       for (int i=1; i<=100; i++) {
           for (int j = 1; j <= i; j++) {
               if (i % 5 == 4 && i % 4 == 3 && i % 3 == 2 && i % 2 == 1) {
                   magicNum = i;
               }
           }
       }
           if (magicNum!=0){
               System.out.println("Your magic number is "+ magicNum);
           }
       }

}
