package com.java.class19;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class StringMethods {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="Hello";
        String str3="hello";

        //1. Change case of string

        System.out.println(str1.toUpperCase()); //HELLO
        System.out.println(str1.toLowerCase()); //hello -

        //2. Equality of the String
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1.equals(str3)); //false -we did not change it we just printed

        //3. Equals ignoring case
        System.out.println(str1.equalsIgnoreCase(str2));//true
        System.out.println(str1.equalsIgnoreCase(str3));//true

        //4. Contains
        String str4="Hello Chirag, Welcome to Ebay";
        System.out.println(str4.contains(str1)); //true
        System.out.println(str4.toLowerCase().contains(str3.toLowerCase())); //false

        //5. Character at Particular Index
        System.out.println(str4.charAt(15)); //e

        //6. Index of particular character
        System.out.println(str4.indexOf("c"));//17

        //7. Length of the String
        System.out.println(str4.length());//29

        //8. Check if the String is empty
        String str5=" ";
        System.out.println(str5.isEmpty()); // false because you have space; no space "" =true
        //System.out.println(str5.isBlank()); -in java>8 //true

        //9. Trim =trimming spaces before and after String
        String str6="       Hello  World  ";
        System.out.println(str6.trim());

        //10. SubString
        String str7= "Hello User, Welcome to Ebay";
        System.out.println(str7.substring(0)); //0-6 no- begins with char 6 then end of the string
        System.out.println(str7.substring(0,6));

        //11. Format
        String title = "Hello %s, Welcome to %s";
        String user= "Chirag";
        String website="Amazon";
        System.out.println(String.format(title,user,website)); //Hello Chirag, Welcome to Amazon.

        //12. Replace
        String title1="Hello ZZZ, Welcome to $$$";
        //title1=title1.replace("ZZZ", user); //storing
        System.out.println(title1.replace("ZZZ", user));
        System.out.println(title1.replace("$$$", website));
        //System.out.println(title1.replace("$$$",website).replace("ZZZ", user));

        //replaceAll()- will learn once we cover regular expression

        //13. Split
        String title2="Hello User, Welcome to Ebay";
        String words[] =title2.split(" "); //array - storing collection of words in "words" /here building array
        System.out.println(words.length); // this will give you the total length of words (5 words)//printing array



    }
}
