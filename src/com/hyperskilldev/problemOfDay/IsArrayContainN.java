package com.hyperskilldev.problemOfDay;

import java.util.Arrays;
import java.util.Scanner;

public class IsArrayContainN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] intArray = new int[arrayLength];
        boolean isContain = false;

        for (int i = 0; i<arrayLength; i++){
            intArray[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        for (int i = 0; i<arrayLength; i++){
            if (intArray[i]==n){
                isContain=true;
            }
        }
        System.out.println(isContain);
    }
}
