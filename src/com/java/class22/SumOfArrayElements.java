package com.java.class22;
// write a program to find sum of elements stored in the array
public class SumOfArrayElements {
    public static void main(String[] args) {
        int nums[]={10,20,30,34,45,23,45,23};
        int sum=0;

        for (int i=0; i<nums.length;i++) {
           // System.out.println(nums[i]); // this will give you all the elements in array
            sum=sum+nums[i];
        }


        System.out.println(sum); //outside of loop to print summation; print inside loop if you want summation after each addition

    }
}
