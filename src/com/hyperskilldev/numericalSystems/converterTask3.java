package com.hyperskilldev.numericalSystems;

import java.util.Scanner;

public class converterTask3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Long number = scanner.nextLong();
        Integer radix = scanner.nextInt();
        StringBuilder sb = new StringBuilder();

        switch (radix) {
            case 2:
                sb.append("0b")
                        .append(Long.toString(number, 2));
                break;
            case 8:
                sb.append("0")
                        .append(Long.toString(number, 8));
                break;
            case 16:
                sb.append("0x")
                        .append(Long.toString(number, 16));
                break;
        }

        System.out.println(sb);
    }
}
