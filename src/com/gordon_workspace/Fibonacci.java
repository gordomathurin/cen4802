package com.gordon_workspace;

public class Fibonacci {


    public Fibonacci() {

    }
    /**
     * Function is used to find the fibonacci sequence of user chosen number using recursive method
     * @param nth (int) is the number that will be used to find its fibonacci sequence
     * @return nth fibonacci sequence
     * @author Gordon Mathurin
     */
    public static int fib(int nth) {
        if (nth <= 1) {
           return 1;
        } else {
             return fib(nth - 1) + fib(nth - 2);
        }

    }
}
