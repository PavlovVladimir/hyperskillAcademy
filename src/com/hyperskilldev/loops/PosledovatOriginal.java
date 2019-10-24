package com.hyperskilldev.loops;

import java.util.Scanner;

public class PosledovatOriginal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();
        long old;

        boolean rordered = true;
        boolean lordered = true;

        while (true) {
            old = num;
            num = sc.nextLong();

            if (num == 0) {
                break;
            }

            if (rordered && num < old) {
                rordered = false;
                continue;
            }

            if (lordered && num > old) {
                lordered = false;
                continue;
            }

            if (!rordered && !lordered) {
                break;
            }
        }

        System.out.println(lordered || rordered);
    }

}