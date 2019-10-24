package com.hyperskilldev.loops;

import java.util.Scanner;

public class MomentOfTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();

        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        int seconds = (seconds2-seconds1)+(minutes2-minutes1)*60+(hours2-hours1)*3600;

        System.out.println(seconds);
    }
}
