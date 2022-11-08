package com.java.class19;
//      1
//     123
//    12345
//   1234567
//  123456789
public class Homework3Pattern3 {
    public static void main(StringAndStringMethods[] args) {
        for (int row = 1; row <= 5; row++) {

            for (int space=1; space<=5-row; space++){
                System.out.print(" ");
            }

            for (int column = 1; column <= row * 2 - 1; column++) {
                System.out.print(column);
            }
            System.out.println();
        }
    }
}