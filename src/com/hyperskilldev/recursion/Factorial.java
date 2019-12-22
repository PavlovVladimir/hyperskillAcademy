package com.hyperskilldev.recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial2(1));
    }
    public static long factorial(long n) {
        //n==1 is not needed
        if (n == 0 || n == 1) {
            return 1; // the trivial case
        } else {
            return n * factorial(n - 1); // the recursive call
        }
    }
    public static long factorial2(long n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
