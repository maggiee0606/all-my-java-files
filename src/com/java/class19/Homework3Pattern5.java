package com.java.class19;

//      1
//     000
//    11111
//   0000000
//  111111111
//   0000000
//    11111
//     000
//      1
public class Homework3Pattern5 {
    public static void main(StringAndStringMethods[] args) {
        //upper
        for (int row = 1; row <= 5; row++) {
            for (int space = 1; space <= 5 - row; space++) {
                System.out.print(" ");
            }
            for (int column = 1; column <= row * 2 - 1; column++) {
                if (row % 2 == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
        //lower
        for (int row = 1; row <= 4; row++) {

            for (int space=1; space <=row;space++){
                System.out.print(" ");
            }
            for (int column = 1; column <= 9 - 2 * row; column++) {
                System.out.print((row+1)%2);
                }
                System.out.println();
            }
        }
    }