package com.hyperskilldev.arrays;


import java.util.Scanner;

/**
 * int[][] twoDimArray = new int[3][];
 *
 * twoDimArray[0] = new int[] { 1, 2, 3, 4 }; // the length is 4
 * twoDimArray[1] = new int[] { 5, 7, 3};     // the length is 3
 * twoDimArray[2] = new int[] { 8 };          // the length is 1
 *
 * // let's output the array
 * for (int i = 0; i < twoDimArray.length; i++) {
 *     System.out.println(Arrays.toString(twoDimArray[i]));
 * }
 *
 *
 * So, each 2D array (or "matrix") has its own value.
 *
 * It is also possible to use for-each loop and methods of the class Arrays to fill and print multidimensional arrays.
 *
 * // this code fills the 3-dimensional array
 * int current = 1;
 * for (int[][] dim2Array : cubic) {     // for each 2-dim array
 *     for (int[] vector : dim2Array) {  // for each 1-dim array (vector) of 2-dim array
 *         Arrays.fill(vector, current); // fill the vector
 *     }
 *    current++; // the next current
 * }
 *
 * // this code prints all 2-dimensional arrays
 * for (int[][] dim2Array : cubic) {
 *     for (int[] vector : dim2Array) {
 *         System.out.println(Arrays.toString(vector));
 *     }
 *     System.out.println();
 * }
 *
 *
 * This code prints three 2-dim arrays:
 *
 * [1, 1, 1, 1, 1]
 * [1, 1, 1, 1, 1]
 * [1, 1, 1, 1, 1]
 * [1, 1, 1, 1, 1]
 *
 * [2, 2, 2, 2, 2]
 * [2, 2, 2, 2, 2]
 * [2, 2, 2, 2, 2]
 * [2, 2, 2, 2, 2]
 *
 * [3, 3, 3, 3, 3]
 * [3, 3, 3, 3, 3]
 * [3, 3, 3, 3, 3]
 * [3, 3, 3, 3, 3]
 *
 *
 */
public class IndividualTaxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int companies = scanner.nextInt();
        float [] dohod = new float[companies];
        float nalog = 0;
        float result = 0;
        int index = 0;
        for (int i = 0; i < dohod.length; i++){
            dohod[i] = scanner.nextInt();
        }
        for (int i = 0; i < dohod.length; i++){
            nalog = scanner.nextFloat();
            if (result<(dohod[i]*nalog/100)){
                result = dohod[i]*nalog/100;
//                System.out.println(result);
                index = i;
            } else if (result == (dohod[i]*nalog/100)){continue;}
        }
        index++;

        System.out.println(index);



    }
}
