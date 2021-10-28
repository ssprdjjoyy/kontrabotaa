package com.company;

public class ex1 {
    public static void main(String[] args) {
        int a=10;
        float b=15;
        System.out.println(methodB(a,b));
    }
    public static boolean methodB(int a, float b){
        if(a + b <= 10 || a + b >= 20){
            return false;
        }
        return true;
    }
}