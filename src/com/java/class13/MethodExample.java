package com.java.class13;

public class MethodExample {

        public static void main(String[] args) {
            System.out.println(getMultiplication(10, 20));
            System.out.println(call("100"));
        }

        static int getMultiplication(int a, int b){
            int result = a * b;
            return result;
        }

        static String call(String phoneNumber){
            return "Calling... "+ phoneNumber;
        }

        static void text(String phoneNumber, String text){
            System.out.println("Sending text "+text+" to "+ phoneNumber);
        }
    }

