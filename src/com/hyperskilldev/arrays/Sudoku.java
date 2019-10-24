package com.hyperskilldev.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isHorizontal = true;
        boolean isVertical = true;
        boolean isField = true;
        boolean getNull = true;

        int fields = scanner.nextInt();
        int fullField = fields*fields;

        int[][] sudoku  = new int[fullField][fullField];
//Fill the array of sudoku
        for (int i = 0; i<fullField; i++) {
            for (int j = 0; j < fullField; j++) {
                sudoku[i][j] = scanner.nextInt();
                if (sudoku[i][j]==0){getNull=false;}
            }
        }
//Check horizontal
        int [] horizontal = new int[fullField];
        for (int i = 0; i<fullField; i++) {
            for (int j = 0; j<fullField; j++){
                horizontal[j] = sudoku[i][j];
            }
            Arrays.sort(horizontal);
            if (horizontal[0]!=1 || horizontal[fullField-1]!=fullField){isHorizontal=false; break;}
            for (int j = 0; j<fullField-1;j++){
                if (horizontal[j+1]-horizontal[j]!=1){
                    isHorizontal = false;
                    break;
                }
            }

        }
//Check vertical
        int [] vertical = new int[fullField];
        for (int j = 0; j < fullField; j++){
            for (int i = 0; i < fullField; i++){
                vertical[i] = sudoku[i][j];
            }
            Arrays.sort(vertical);
            if (vertical[0]!=1 || vertical[fullField-1]!=fullField){isVertical=false; break;}
            for (int k = 0; k < fullField-1; k++){
                if (vertical[k+1]-vertical[k]!=1){
                    isVertical = false;
                    break;
                }
            }
        }

        int [] filedsArr = new int[fullField];
        for (int n=0; n<=fullField-fields;n+=fields) {
            for (int k = 0; k <= fullField - fields; k += fields) {
                int l = 0;
                for (int i = 0; i < fields; i++) {
                    for (int j = 0; j < fields; j++) {
 //                       System.out.println(l);
                        filedsArr[l] = sudoku[i+n][j + k];
                        l++;
                    }

                }
 //               System.out.println(Arrays.toString(filedsArr));
                Arrays.sort(filedsArr);
                if (filedsArr[0]!=1 || filedsArr[fullField-1]!=fullField){isField=false; break;}
                for (int m = 0; m < fullField - 1; m++) {
                    if (filedsArr[m+1] - filedsArr[m]!=1) {
                        isField = false;
                        break;
                    }
                }
            }
        }

        if (isHorizontal&&isVertical&&isField&&getNull){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

//            for (int i=0; i<fullField; i++){
//            for (int j=0; j<fullField; j++){
//                System.out.print(sudoku[i][j]);
//            }
//            System.out.println();
//        }
            System.out.println(isHorizontal);
            System.out.println(isVertical);
            System.out.println(isField);

    }
}
