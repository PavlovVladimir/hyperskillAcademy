package com.hyperskilldev.arrays;


import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenght = scanner.nextInt();
        int [] numbers = new int [lenght];

        for (int i=0; i <numbers.length;i++) {
             numbers[i]=scanner.nextInt();
        }

    System.out.println(Arrays.stream(numbers).sum());

    }
}
