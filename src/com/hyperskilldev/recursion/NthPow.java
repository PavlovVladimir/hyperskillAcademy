package com.hyperskilldev.recursion;

import java.util.Scanner;

public class NthPow {
    public static double pow(double a, long n) {
        if (n==0){
            return 1;
        }
        if (n==1){
            return a;
        }
        if (n%2==0){
            return pow(a*a,n/2);
        } else {
           return a*pow (a,n-1);
        }

    }
    public static long method(long n) {
        if (n <= 1) {
            return n;
        }
        return n + method(n - 1) - 1;
    }

    public static int method2(int n) {
        if (n == 0) {
            return 1;
        } else {
            return 2 * method2(n - 1);
        }
    }

    public static long sumOfNumbers(long n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfNumbers(n / 10);
    }

    public static void printDollars(int n) {
        if (n > 1) {
            printDollars(n - 1);
        }

        for (int i = 0; i < n; i++) {
            System.out.print("$");
        }
    }

    public static String binaryRepresentation(int n) {
        if (n == 0 || n == 1) {
            return String.valueOf(n);
        }
        return binaryRepresentation(n / 2) + String.valueOf(n % 2);
    }

    public static boolean checkThePowerOfThree(int n) {
        if (n == 0) {
            return false;
        } else if (n == 1) {
            return true;
        } else if (n % 3 != 0) {
            return false;
        } else {
            return checkThePowerOfThree(n / 3);
        }
    }

    public static long powerOfTwo(long n) {
        if (n == 1) {
            return 0;
        }
        return powerOfTwo(n / 2) + 1;
    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) { // (1)
            return true; // (2)
        }

        int lastIndex = s.length() - 1; // (3)
        boolean r = s.charAt(0) == s.charAt(lastIndex); // (4)

        return r && isPalindrome(s.substring(1, lastIndex)); // (5)
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
//        final double a = Double.parseDouble(scanner.nextLine());
//        final int n = Integer.parseInt(scanner.nextLine());
//        System.out.println(pow(a, n));
        System.out.println("-------------------");
//        System.out.println(sumOfNumbers(521));
////        printDollars(4);
//        System.out.println(binaryRepresentation(5));
//        System.out.println( powerOfTwo(64) );
//        System.out.println(isPalindrome("baab"));

    }
}
