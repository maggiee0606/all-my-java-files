package com.java.class20;
//import java.util.Scanner;
////Write a program to take the full name from the user and print the first letter of the first name and last name
////Example
////Input - Thomas Joe
////Output  - T.J
////Another Example
////Input - Charlie Kyle
////Output - C.K (edited)
import java.util.Scanner;

public class FullNameToInitials {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your full name.");
        String firstName= sc.next();
        String lastName=sc.next();
        String initials=firstName.substring(0,1)+"." +lastName.substring(0,1);

        System.out.println("Initials of your name are: " + initials);


        System.out.println("===================================================");



        System.out.println("Please enter your first name.");
        String first= sc.next();
        System.out.println("Please enter your last name.");
        String last= sc.next();

        System.out.println(first.charAt(0)+"."+last.charAt(0));
        System.out.println("===================================================");

        //this will work for entering first name and middle name and last name=FOR LOOP

        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter full name");
        String name1= scanner.nextLine();

        String initial= name1.charAt(0)+ ".";             //we need String instead of char because we need M.A.

        for (int i=0; i< name1.length(); i++){
            if (name1.charAt(i) == ' ') {
                initial=initial + name1.charAt(i+1) + ".";        //it will take first letter after first space
            }
        }
        System.out.println(initial);
    }
}
