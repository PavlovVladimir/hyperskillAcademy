package com.hyperskilldev.regexp;

import java.util.Scanner;

public class RemoveComments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String codeWithComments = scanner.nextLine();
        codeWithComments = "int b = 0;/* expression */ b = b /* **/* b /* b * b = b squared */; // 0 * 0 = 0";

        codeWithComments = codeWithComments.replaceAll("\\/\\*.*?(\\*\\/)","");
        codeWithComments = codeWithComments.replaceAll("(\\/\\/.*)$","");
        System.out.println(codeWithComments);
    }
    }

