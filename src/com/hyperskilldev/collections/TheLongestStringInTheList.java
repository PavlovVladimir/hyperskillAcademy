package com.hyperskilldev.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TheLongestStringInTheList {
    public static void changeList(List<String> list) {
        int max = Integer.MIN_VALUE;
        String maxLine = "";
        for (String item : list) {
            int tempLen = item.length();
            if (tempLen > max) {
                max = item.length();
                maxLine = item;
            }
        }
        Collections.fill(list, maxLine);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}
