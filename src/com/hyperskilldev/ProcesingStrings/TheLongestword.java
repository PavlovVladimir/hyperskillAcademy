package com.hyperskilldev.ProcesingStrings;

import java.util.Scanner;

public class TheLongestword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] substr = str.split(" ");
        String longestWorld="";
        int maxLenght = 0;
        for (String str1 :
                substr) {
                if (maxLenght < str1.length()){
                longestWorld = str1;
                maxLenght = str1.length();
            }
        }
        System.out.println(longestWorld);

    }
}
