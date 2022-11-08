package com.java.class21;
//1. Java Program to count the total number of vowels and consonants in a string
//Example
//Input - Today is Saturday
//Output - Total Vowels - 6, Total Consonants -  9
import java.util.Scanner;

public class HWVowelRemoveSpacePalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter string: ");
        String words=sc.nextLine().toLowerCase();

        int vowelCounts=0;
        int consonants=0;

        for (int i=0; i<words.length(); i++){
           if (words.charAt(i)=='a' || words.charAt(i)=='e' || words.charAt(i)=='i' || words.charAt(i)=='o' || words.charAt(i)=='u'){
                vowelCounts++;
            }else if (words.charAt(i)==' ' || words.charAt(i) == '!' || words.charAt(i)=='.' || words.charAt(i)==',') {
               vowelCounts = vowelCounts + 0;
           }else{
               consonants++;
            }
        }
        System.out.println("Total Vowels: " + vowelCounts);
        System.out.println("Total Consonants: "+ consonants);





        System.out.println("==========================================================");
        //from a string
        //Example
        //Input - Today is Saturday
        //Output - TodayisSaturday

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = scanner.nextLine();

        System.out.println(str.replace(" ", ""));







        System.out.println("============================================================");

        //Java Program to determine whether a given string is palindrome or not by ignoring the case of characters and white spaces
        //Example
        //Input - Was it a car or a cat I saw
        //Output - Palindrome

        System.out.println("Please enter a string: ");
        String str1=sc.nextLine().toLowerCase();
        String backUp=str1;
        String reverse="";

        for (int i=0; i<str1.length(); i++){
            reverse=str1.charAt(i)+reverse;
        }
        if (backUp.equals(reverse)) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }

        System.out.println("Please enter a string: ");
        String str2=sc.nextLine();
        String reverse1="";
         for (int i=0; i<str.length();i++) {
             reverse = reverse + str2.charAt(i);
         }
         if (backUp.equals(reverse1)) {
             System.out.println("Palindrome");
         }else{
             System.out.println("Not Palindrome");
         }

        System.out.println("=======================================");

        System.out.println("Please enter a string");
         String str3="";
        System.out.println(str.replace(" ",""));
    }
}
