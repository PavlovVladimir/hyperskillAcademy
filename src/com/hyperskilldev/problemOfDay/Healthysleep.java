package com.hyperskilldev.problemOfDay;

import java.util.Scanner;

public class Healthysleep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int h = scanner.nextInt();

            if (h<a){
                System.out.println("Deficiency");
            } else if (h>b){
                System.out.println("Excess");
            } else if (h>=a && h <=b){
            System.out.println("Normal");
        }

    }

}
