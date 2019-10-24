package com.hyperskilldev.bitwise;

/**
 * There are four bitwise operators: ~ (bitwise NOT, inversion, complement), | (bitwise OR), & (bitwise AND) and ^ (bitwise XOR). Each of these operators goes though all bits of both operands (numbers) one by one (i.e. bitwise) ﻿and produces a new number as a result.
 *
 *     ~ is a unary operator that inverses bits in the binary format of the number making every 0 a 1 and every 1 a 0. It also changes the sign bit of the value.
 *     | is a binary operator that performs bitwise OR: the result digit is 1 if at least one operand digit is 1, otherwise, it is 0;
 *     & is a binary operator that performs bitwise AND: the result digit is 1 if both operand digits are 1, otherwise, it is 0;
 *     ^ is a binary operator that performs bitwise XOR: the result digit is 1 if exactly one operand is 1, otherwise, it is 0
 */
public class BitwiseOperators {
    public static void main(String[] args) {
//        int num1 = 1|4;
//        int num2 = 1^4;
//        int num3 = 1&4;
//
//        System.out.println(num1);
//        System.out.println(num2);
//        System.out.println(num3);
//        int n1 = 1;
//        int n2 = 2;
//        int n3 = 4;
//
//        int result1 = n1 & n2;
//        int result2 = result1  | n3;
//        System.out.println(result1);
//        System.out.println(result2);

//        int n1 = 7;
//        int n2 = 1;
//
//        int result = n1 & n2;
//        System.out.println(result);

        int n = 15;

        int result1 = n << 2 ;
        int result2 = result1<< 1;
        int result3 = n>>1;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        double a = 8;
        double b = 5;
        double c = a / b + 1.1;
        System.out.println(a/b);
        System.out.println(c);
    }
}
