package com.hyperskilldev.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class IsArraySorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrLenght = scanner.nextInt();
        int[] arr = new int[arrLenght];
        int [] arrUp = new int[arrLenght];
        int [] arrDown = new int[arrLenght];
        Integer [] collect = new Integer[arrLenght];

        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
            arrUp[i] = arr[i];
            collect[i] = arr[i];
            }

        Arrays.sort(arrUp);
        Arrays.sort(collect, Collections.reverseOrder());

        for(int i = 0; i <  arr.length; i++) {
            arrDown[i] = collect[i];
        }

        if (Arrays.equals(arr,arrUp) || Arrays.equals(arr,arrDown)){
            System.out.println("true");
        } else {System.out.println("false");}
        }





}


