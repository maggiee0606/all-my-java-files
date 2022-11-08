package com.java.class22;

//Arrays-store collection of, store only one type of data;
//container to hold more than one values of SIMILAR data types
public class ArraysExample {
    public static void main(String[] args) {
        //Declaration of array - Declaration will not initialize size in memory
       // int data []= // normally here after variable
        // int [] data =
        int data []; //  Declaration will not initialize size in memory, no any memory
        int a; // memory: 4 bytes

        // Initialize the array
        // Important - in Java when we want to initialize variable that can hold collation of values we need to use NEW keyword
        data = new int [5];

        //Declaration and Initialization in the same line
        int salary[]=new int[100]; // we don't know values, so we initialize with maximum capacity

        //Declaration and assignment in the same line
        int nums[]={10,20,30,34,45,23,45,23,12,65,23}; // We can assign fixed set of numbers

        //Length of the Array
        System.out.println(nums.length); //11

        //Print value at particular index
        System.out.println(nums[4]);
        //Print all data from array:
        System.out.println("=========Print all data from array=========");
        for (int i=0; i<nums.length; i++){ // it will give you number of elements inside the array
            System.out.println(i);              //Print all data from array
        }

        //Print default value of element of array
        System.out.println(salary[45]);

        System.out.println(nums[21]);
    }
}
