package com.hyperskilldev.regexp;

import java.util.Scanner;

public class NumberParsing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        // valid numbers 1.0 -1.1
        //invalid numbers 1.11110
        String regex = "^[+-]?(0{1}|[1-9]\\d*)([,.](\\d|\\d+[^0]))?$";
        boolean matches = number.matches(regex);
        System.out.println(matches);
    }
}
