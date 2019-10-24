package com.hyperskilldev.loops;

import java.util.Scanner;

public class MaximumOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int max = 0;
        int loop = 0;
        int a = 0;

        while (loop<count){
            a = scanner.nextInt();
            if (a%4==0){
                if (a>max){max = a;}
            }
            loop++;
        }

        System.out.println(max);

    }
}
