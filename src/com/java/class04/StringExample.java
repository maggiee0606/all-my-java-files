package com.java.class04;

public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Everyone";
        String str3 = " ";
        int num1 = 10;
        int num2 = 20;
        double d = 10.1;

        System.out.println (str1 +str2); // concatenation
        System.out.println (str1 + num1); // //concatenation
        System.out.println (str1+num1+num2); // concatenation
        System.out.println (num1+num2+str1); // Add, concat
        System.out.println (str1+(num1+num2)); // Hello30
        System.out.println (str1+num1*num2); // Hello200
        System.out.println (str1 + num1 + num2 + str2); //Hello1020Everyone
        //System.out.println (str1 + num1 - num2); //Error - if use - minus
        System.out.println(num1 + "num2"+ str1);
        //System.out.println(str1+(num2-num1));




    }
}
