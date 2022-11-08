package com.java.class19;

public class HWPattern3 {
    public static void main(StringAndStringMethods[] args) {
        for(int i=1; i<=5;i++){
            for(int k=5-i;k>0;k--){
                System.out.print(" ");
            }
            for(int j=1; j<=i*2-1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
