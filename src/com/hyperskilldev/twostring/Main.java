package com.hyperskilldev.twostring;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String str1 = scanner.nextLine().replace(" ","");
        String str2 = scanner.nextLine().replace(" ","");
        boolean result = str1.equals(str2);

        System.out.print (result);
    }
}
