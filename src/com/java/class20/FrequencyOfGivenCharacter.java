package com.java.class20;
// Write a program to find frequency of given character of the String

//Hello, How are you?
//Character 'e'
//Output: 2
public class FrequencyOfGivenCharacter {
    public static void main(String[] args) {
        String str = "Hello, How are you TETIANA? ";
        char target = 'e';
        int count=0;


        for (int i = 0; i < str.length(); i++) { //first print each char
            if (str.toLowerCase().charAt(i) == target) {
                count++;
            }
        }
        System.out.println(count);
    }
}