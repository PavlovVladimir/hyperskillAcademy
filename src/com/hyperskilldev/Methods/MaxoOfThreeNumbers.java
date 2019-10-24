package com.hyperskilldev.Methods;

import java.util.Scanner;

public class MaxoOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(getNumberOfMaxParam(a,b,c));

    }

    public static int getNumberOfMaxParam(int a, int b, int c) {
       int max = 0;
        if (a>=b&&a>=c){
            max = 1;
        } else if (b>=a&&b>=c){
            max = 2;
        } else if (c>=a&&c>=b){
            max = 3;
        }
        return max;
    }
}
