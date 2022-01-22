package com.gordon_workspace;

public class Fibonacci {

    public Fibonacci() {

    }

    public static int fib(int nth) {
        if (nth <= 1) {
           return 1;
        } else {
             return fib(nth - 1) + fib(nth - 2);
        }

    }
}
