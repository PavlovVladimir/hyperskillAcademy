package com.hyperskilldev.problemOfDay;

import java.util.Scanner;

public class DoubleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] doubleChar = scanner.nextLine().toCharArray();

        for (char ch:doubleChar
             ) {
            System.out.print(ch);
            System.out.print(ch);
         //   System.out.println(DoubleCharacters.class.getName());
        }
    }
}
