package com.hyperskilldev.variables;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in); // 1
        final int a;                                    // 2
//        final int b = scanner.nextInt() + a;            // 3
        final int c = 0;                                // 4
//        c = b;                                          // 5
        System.out.println(c + 1);                      // 6
    }
}
