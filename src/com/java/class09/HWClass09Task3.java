package com.java.class09;

import java.util.Scanner;

//Task #3: Write a Program To Count Total Number Of Minimum Notes In Given Amount (Notes are of 1, 2, 5, 10, 20, 100 & 500)
//Example
//Input  : Amount = 255
//Output : 2 Notes of 100
//		 2 Notes of 20
//		 1 Note of 10
//       1 Note of 5
public class HWClass09Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write a number of how many notes you have? ");

        int amountNotes= sc.nextInt();
        int notes500=amountNotes/500;
        int notes100=(amountNotes%500)/100;
        int notes20=(amountNotes%100)/20;
        int notes10=(amountNotes%20)/10;
        int notes5=(amountNotes%10)/5;
        int notes2=(amountNotes%5)/2;
        int notes1=(amountNotes%2)/1;

        System.out.println("There is " + notes500 + " notes of 500.");
        System.out.println("There is " + notes100 + " notes of 100.");
        System.out.println("There is " + notes20 + " notes of 20.");
        System.out.println("There is " + notes10 + " notes of 10.");
        System.out.println("There is " + notes5 + " notes of 5.");
        System.out.println("There is " + notes2 + " notes of 2.");
        System.out.println("There is " + notes1 +  " notes of 1.");


    }
}
