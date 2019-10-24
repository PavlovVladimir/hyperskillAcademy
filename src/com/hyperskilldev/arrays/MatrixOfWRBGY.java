package com.hyperskilldev.arrays;

import java.util.Scanner;

public class MatrixOfWRBGY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "YES";
        char[][] matrix = new char[4][4];
        for (int i=0; i<4; i++){
            matrix[i] = scanner.next().toCharArray();
        }

        for (int i = 0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                char a = matrix[i][j];
                char b = matrix[i][j + 1];
                char c = matrix[i + 1][j];
                char d = matrix[i + 1][j + 1];
                if (a == b && a == c && a == d) {
                    result = "NO";
                }
            }
        }
        System.out.println(result);


//        for (int i=0; i<4; i++){
//            for (int j=0; j<4; j++){
//                System.out.print(matrix[i][j]);
//            }
//            System.out.println();
//        }
//        long l = Integer.MAX_VALUE; // (1)
//        int i = l; // (2)
//        char ch = i; // (3)
//        double d = ch; // (4)
//        float f = d; // (5)
    }
}
