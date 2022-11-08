package com.java.class11;

public class SwitchExample2 {
    public static void main(String[] args) {
        int num=31;

        switch (num){
            case 0:
                System.out.println("zero");
                break;
            default:
                System.out.println("error"); // you need to add break
            case 2:
                System.out.println("Two");
                break;
            case 1:
                System.out.println("one");
                break;

        }
    }
}//position on default doesn't matter it will still match one; if no match it will execute default
//if 31 and no break after default it will execute 2 as well bc no break