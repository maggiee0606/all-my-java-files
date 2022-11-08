package com.java.class22;
//write a program to count of =ve and -ve numbers from array
public class CountPositiveAndNegative {
    public static void main(String[] args) {
        int data []={-12,34,-45,54,-23,56,78,-2,21};
        int positiveCount=0;
        int negativeCount=0;
        int zero=0;
        for (int i=0; i<data.length;i++){//go over each element of array
            //System.out.println(data[i]); will print all the numbers
            if (data[i]>0) {
                positiveCount++;
            }else{
                negativeCount++;

                }
            }
        System.out.print("Total positive numbers: "+positiveCount+  "   Total negative numbers: "+ negativeCount);
        }

    }

