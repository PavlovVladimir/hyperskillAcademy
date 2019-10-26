package com.hyperskilldev.ProcesingStrings;

import java.util.Scanner;

public class FirstNCharToEndOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();
        int len = s.length();
        if (n<len){
            System.out.println(s.substring(n,len)+s.substring(0,n));
        } else {
            System.out.println(s);
        }
    }
}
