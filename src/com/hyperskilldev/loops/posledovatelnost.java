package com.hyperskilldev.loops;

import java.util.Scanner;

public class posledovatelnost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int posled = 0;
        int result = 0;

    do {
        posled = scanner.nextInt();
        if (result < posled){
            result = posled;
        }
    } while (posled !=0);

    System.out.println(result);

    }
}
