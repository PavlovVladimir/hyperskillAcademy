package com.hyperskilldev.recursion;

import java.util.Scanner;

public class NumbersBySum {
    static int[] workArray = new int[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputN = sc.nextInt();
        factorizator(inputN, inputN, 0);
    }

    static void factorizator(int n, int k, int i) {

        if ( n < 0 ) return;
        if ( n == 0 ) {
            for (int j = 0; j < i; j++) System.out.print(workArray[j] + " ");
            System.out.println();
        }
        else {
            if ( k > 1) factorizator(n, k - 1, i);
            if ( n >= k) {
                workArray[i] = k;
                factorizator(n - k, k, i + 1);
            }

        }
    }
}

