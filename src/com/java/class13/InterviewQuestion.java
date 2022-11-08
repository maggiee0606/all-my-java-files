package com.java.class13;

public class InterviewQuestion {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        System.out.println(changeValue(a));
    }
    static int changeValue(int a) {
        return a+5;

    }

}//it is not printing 10 because it is VOID and it is not storing result anywhere
