package com.java.class22;
//Write a program to find index of the number
//12,34,56,23,76,33,76,32,21
//76
//output-4
public class FindIndexOfNumber {
    public static void main(String[] args) {
        int data[] = {12, 34, 56, 23, 76, 33, 74, 32, 21};
        int targetNum = 99;
        System.out.println(findIndex(data, targetNum));
    }

    static int findIndex(int[] data, int targetNumber) {

        for (int i = 0; i < data.length; i++) {
            if (data[i] == targetNumber) {
                return i;
            }
        }
        return -1;      ///if index is not present with will print -1 because the index will be always 0+
    }
}