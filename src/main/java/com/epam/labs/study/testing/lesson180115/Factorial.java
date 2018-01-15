package com.epam.labs.study.testing.lesson180115;

public class Factorial {
    public static long fact(int n) {
        if (n < 0) throw new IllegalArgumentException("n<0");
        if (n < 2) return 1;
        long answ = 1;
        for (long i = 2; i <= n; i++) {
            answ = answ * i;
        }
        return answ;
    }
}
