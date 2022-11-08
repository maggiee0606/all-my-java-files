package com.java.class20;

import java.util.Scanner;


public class CountNumberOfSpaces {
    public static void main(String[] args) {
        String str = "Hello, my name is Maggie. ";
        char target = 'e';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }


    }}
