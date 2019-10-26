package com.hyperskilldev.problemOfDay;
/**
 * import java.util.Scanner;
 *
 * class Main {
 *     public static void main(String[] args) {
 *         Scanner sc = new Scanner(System.in);
 *
 *         int n = sc.nextInt();
 *         int[][] spiral = new int[n][n];
 *
 *         int value = 1;
 *         int minCol = 0;
 *         int maxCol = n - 1;
 *         int minRow = 0;
 *         int maxRow = n - 1;
 *
 *         while (value <= n * n) {
 *             for (int i = minCol; i <= maxCol; i++) {
 *                 spiral[minRow][i] = value;
 *                 value++;
 *             }
 *             for (int i = minRow + 1; i <= maxRow; i++) {
 *                 spiral[i][maxCol] = value;
 *                 value++;
 *             }
 *             for (int i = maxCol - 1; i >= minCol; i--) {
 *                 spiral[maxRow][i] = value;
 *                 value++;
 *             }
 *             for (int i = maxRow - 1; i >= minRow + 1; i--) {
 *                 spiral[i][minCol] = value;
 *                 value++;
 *             }
 *             minCol++;
 *             minRow++;
 *             maxCol--;
 *             maxRow--;
 *         }
 *
 *         for (int i = 0; i < spiral.length; i++) {
 *             for (int j = 0; j < spiral.length; j++) {
 *                 System.out.print(spiral[i][j] + "\t");
 *             }
 *             System.out.println();
 *         }
 *
 *     }
 * }
 */

import java.util.Scanner;

public class SpiralNumbers {
   public static int n;
   public static int n2;
    private static int [] strNumbers;
    private static int [][] spiralNumbers;
    private static boolean goToRight = false;
    private static boolean goToLeft = false;
    private static boolean goToDown = false;
    private static boolean goToUp = false;
    private static int left;
    private static int right;
    private static int up;
    private static int down;
    private static int index = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         n = scanner.nextInt();
         n2 = n*n;



        strNumbers = new int[n2];

        for (int i=0;i<n2;i++){
            strNumbers[i] = i+1;
        }

        spiralNumbers = new int[n][n];
        left =0;
        right = spiralNumbers.length-1;
        up = 0;
        down = spiralNumbers.length-1;

        for (int i=0; i<spiralNumbers.length;i++){
            int j = 0;
            spiralNumbers[j][i]=strNumbers[i];
            index++;
        }
        goToRight=false;
        goToDown=true;

        up ++;



        while (index<n2){
            if(goToDown){
                    for (int i = up; i <= down; i++){
                        spiralNumbers[i][right] = strNumbers[index];
                        index++;
                    }
                    right--;
                    goToDown = false;
                    goToLeft = true;
            }

            if (goToLeft){
                    for (int i = right; i>= left; i--){
                        spiralNumbers[down][i] = strNumbers[index];
                        index++;
                    }
                    down--;
                    goToLeft = false;
                    goToUp = true;
            }

            if (goToUp){
                for (int i = down; i>=up; i--){
                    spiralNumbers[i][left]=strNumbers[index];
                    index++;
                }
                left++;
                goToUp = false;
                goToRight = true;
            }

            if (goToRight){
                for (int i=left; i<=right; i++){

                    spiralNumbers[up][i] = strNumbers[index];
                    index++;
                }
                up++;
                goToRight = false;
                goToDown=true;
            }



        }
        printArray();

    }

    public static void printArray(){
        for (int i = 0; i < spiralNumbers.length; i++) {
            for (int j = 0; j < spiralNumbers.length;j++) {
                System.out.print(spiralNumbers[i][j]+" ");
            }
            System.out.println();

        }
    }

    public static void printVariables() {
        System.out.println("private static int n:" + n);
        System.out.println("private static int n2: " + n2);
        System.out.println("private static boolean GOTORIGHT: " + goToRight);
        System.out.println("private static boolean GOTODOwN: " + goToDown);
        System.out.println("private static boolean GOTOLEFT: " + goToLeft);
        System.out.println("private static boolean GOTOUP: " + goToUp);
        System.out.println("private static int left: " + left);
        System.out.println("private static int right:" + right);
        System.out.println("private static int up: " + up);
        System.out.println("private static int down: " + down);
        System.out.println("private static int index: " + index);
    }


}
