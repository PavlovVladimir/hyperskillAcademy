package com.hyperskilldev.various;

public class AlphabetInInt {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("=======SMALL=======");
        for (char ch: alphabet.toCharArray()
             ) {
            System.out.println((int) ch);
        }
        System.out.println("==============");
        System.out.println();
        alphabet = alphabet.toUpperCase();
        System.out.println("=======BIG=======");
        for (char ch: alphabet.toCharArray()
        ) {
            System.out.println((int) ch);
        }
        System.out.println("==============");
    }
}
