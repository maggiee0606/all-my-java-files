package com.java.class07;
//wRITE A program to get 2 numbers from user
// and print max number
import java.util.Scanner;
public class IfElseExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First number: ");
        int num1 = sc.nextInt();
        System.out.println("Second number: ");
        int num2 = sc.nextInt();

        maxNumber(num1,num2);
    }
    static void maxNumber(int num1, int num2){
       if (num1>num2) {
           System.out.println("Max number is " + num1);
       } else if (num2>num1) {
           System.out.println("Max number is " + num2);
       } else {
           System.out.println("Numbers are equal ");
       }

    }
}
