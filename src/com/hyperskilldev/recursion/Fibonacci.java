package com.hyperskilldev.recursion;

public class Fibonacci {
    public static void main(String[] args) {
//        System.out.println(fib(45));
        System.out.println(method(2,5));
    }
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static long method(long a, long b) {
        if (b == 0) {
            return b;
        }
        return a + method(a, b - 1);
    }
}
