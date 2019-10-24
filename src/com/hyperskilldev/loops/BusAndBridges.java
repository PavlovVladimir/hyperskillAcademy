package com.hyperskilldev.loops;

import java.util.Scanner;

public class BusAndBridges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int brifgesCount = scanner.nextInt();
        int i=1;

        for (;i<=brifgesCount;i++){
            int bridgeHeight = scanner.nextInt();
            if (bridgeHeight<busHeight){
                System.out.println("Will crash on bridge "+i);
                break;
            }
            if (i==brifgesCount){
                System.out.println("Will not crash");
            }
        }


    }
}
