package com.hyperskilldev.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StarArrayFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfArrays = scanner.nextInt();
        String [][] star = new String[numOfArrays][numOfArrays*2];
        int j = 0;

//Fill array by " "
        for (int i = 0; i<star.length;i++){
            for (j = 0; j<numOfArrays*2-1;j++){
            star[i][j]=" ";
            }
        }
//Fill array by "."
        for (int i = 0; i<star.length;i++){
            for (j = 0; j<numOfArrays*2-1;j+=2){
                star[i][j] = ".";
            }
        }

//Fill vertical
        for (int i = 0; i<star.length;i++) {
            star[i][star.length-1] = "*";
        }

//Fill horizontal
        for (j = 0; j<star.length*2-1;j+=2) {
            star[star.length/2][j] = "*";
        }

// Fill \
        j=0;
        for (int i = 0; i<star.length;i++){
            star[i][j] = "*";
            j+=2;
        }

//Fill /
        j=0;
        for (int i = star.length-1; i>=0; i--){
            star[i][j] = "*";
          j+=2;
        }

//Output to console
        for (int i = 0; i<star.length;i++){
            for (j = 0; j<numOfArrays*2-1;j++){
                System.out.print(star[i][j]);
            }
            System.out.println();
        }

        for (String[] str :star
             ) {
            System.out.println(Arrays.asList(str));
        }





    }
}
