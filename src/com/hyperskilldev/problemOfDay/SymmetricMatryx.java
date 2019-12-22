package com.hyperskilldev.problemOfDay;

import java.util.Scanner;

public class SymmetricMatryx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        boolean symmetric = true;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                }
            }
        }

        if (symmetric) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

////for debug
//        for (int i=0; i<matrix.length; i++){
//            for (int j = 0; j<matrix.length; j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }

    }
}
