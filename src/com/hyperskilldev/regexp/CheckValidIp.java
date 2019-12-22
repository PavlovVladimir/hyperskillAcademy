package com.hyperskilldev.regexp;

import java.util.Scanner;

public class CheckValidIp {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String bytePattern = "(1?\\d?\\d|2[0-4]\\d|25[0-5])";
        final String ipPattern = String.join(
                "\\.", bytePattern, bytePattern, bytePattern, bytePattern
        );
        final String text = scanner.nextLine();

        System.out.println(text.matches(ipPattern) ? "YES" : "NO");
    }
}
