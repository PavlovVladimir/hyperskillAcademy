package com.hyperskilldev.recursion;

import java.util.Scanner;

public class RecursionPrint {

    /* Fix this method */
    public static void printReverseCharByChar(String s) {

        if (s.length() > 0) {
            int last = s.length() - 1;
            System.out.println(last);
             System.out.print(s.charAt(last));
            System.out.println("IN "+s.substring(0,last));
            printReverseCharByChar(s.substring(0, last));
            System.out.println("OUT "+s.substring(0,last));

        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        printReverseCharByChar(scanner.nextLine());
    }
}
