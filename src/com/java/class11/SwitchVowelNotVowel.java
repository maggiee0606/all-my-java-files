package com.java.class11;

import java.util.Scanner;

public class SwitchVowelNotVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter a character: ");
        char Char=sc.next().toLowerCase().charAt(0);
        String result="";

        switch (Char){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                result="vawel";
                break;
            default:
                result="consonant";
                break;

        }
        System.out.println(result);
    }
}
