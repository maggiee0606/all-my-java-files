package com.java.class12;

import java.util.Scanner;

//Create Reusable method
public class MethodExample {

    static void printLineWithEqual(int length) {
        for (int i = 0; i < length; i++) {

        System.out.println("="); //make line longer :
    }
    System.out.println();
}
    //Name of the Method -printLineWithHyphen
    //Return type =-void
    //Parameter -() <-- no parameter
    //Method Body -System.out.println("------------------------");

    static void printLineWithHyphen(){
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printLineWithEqual(50); //create function to print this line  //Method call
        System.out.println("Welcome to the calculator");
        printLineWithEqual(50); //Method call

        printLineWithEqual(20); //Method call
        System.out.println("Print first number:");
        printLineWithHyphen(); //Method call
        int num1 = sc.nextInt();

        printLineWithHyphen(); //Method call
        System.out.println("Print second number:");
        printLineWithHyphen(); //Method call
        int num2 = sc.nextInt();

        printLineWithEqual(20); //Method call
        System.out.println("Here is your addition: " + (num1 + num2));
        printLineWithEqual(20); //Method call

    }
//
//    //create function here
//    static void printLineWithEqual() {
//        System.out.println("=========================");
//    }
//    static void printLineWithHyphen(){
//            System.out.println("------------------------");
//
//        }                                        //printLine//==function/method name - camelCasing

    }
