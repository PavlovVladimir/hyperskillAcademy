package com.hyperskilldev.numericalSystems;

import java.util.Scanner;

public class converterTask4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer radix = scanner.nextInt();
        Integer number = scanner.nextInt();
        Integer destinationRadix = scanner.nextInt();

        switch (radix) {
            case 1:
                number = number.toString().length();
                printNumber(number, destinationRadix);
                break;
            case 10:
                printNumber(number, destinationRadix);
                break;
            default:
                number = Integer.parseInt(number.toString(), radix);
                printNumber(number, destinationRadix);
                break;
        }
    }

    public static void printNumber(Integer number, Integer radix) {
        if (radix == 1) {
            for (int i = 0; i < number; i++) {
                System.out.print(1);
            }
            return;
        }
        System.out.println(Integer.toString(number, radix));
    }
}
