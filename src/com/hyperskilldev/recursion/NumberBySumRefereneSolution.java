package com.hyperskilldev.recursion;

import java.util.Scanner;

public class NumberBySumRefereneSolution {





        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int toDecompose = scanner.nextInt();

            provideDecomposition(toDecompose, toDecompose, "");
        }

        private static void provideDecomposition(int toDecompose, int max, String out) {
            if (toDecompose == 0) {
                System.out.println(out);
            } else if (toDecompose > 0) {
                for (int i = 1; i <= max; i++) {
                    provideDecomposition(toDecompose - i, i, out + i + " ");
                }
            }
        }
    }

