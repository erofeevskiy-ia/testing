package com.epam.labs.study.testing.lesson180115;

public class MathOperation {

    public static long multiplication(int a, int b){
        return a*b;
    }

    public static double division(int a, int b){
        if(b==0) throw new IllegalArgumentException("divider is 0");
        return a/b;
    }
}
