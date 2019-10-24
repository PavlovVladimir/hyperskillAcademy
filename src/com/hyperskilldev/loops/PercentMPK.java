package com.hyperskilldev.loops;

import java.util.Scanner;

public class PercentMPK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextInt();
        double p = scanner.nextInt();
        double k = scanner.nextInt();
        int years = 0;

        for (;m<k;years++){
            m +=m*p/100;
        }

        System.out.println(years);
    }
}
