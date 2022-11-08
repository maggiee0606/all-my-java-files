package com.java.class19;

public class HWPattern2 {
    public static void main(StringAndStringMethods[] args) {
        for(int i=5; i>=1;i--){
            for(int k=0;k<5-i;k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i*2-1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
