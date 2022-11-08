package com.java.class17;

import java.util.Scanner;

public class NestedForLoopsEx8ChristmasTree {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int num = scanner.nextInt();

            for (int i = 1; i <= num; i++) {

                for(int s=1; s<= num-i; s++){
                    System.out.print(" ");
                }
                for (int j = 1; j <= i*2-1; j++) {
                    System.out.print("A");
                }

                System.out.println();
            }
        }
}