package com.hyperskilldev.problemOfDay;

import java.util.Scanner;

public class SafeConverting {
    public static int convert(Long val) {
//        Long result = val == null ? 0 : val;
        if (val == null) {
            return 0;
        }
        if (val > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (val < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) (long) val;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        Long longVal = "null".equals(val) ? null : Long.parseLong(val);
        System.out.println(convert(longVal));
    }
}
