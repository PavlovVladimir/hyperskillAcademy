package com.hyperskilldev.iterator;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ListIterator2 {
    public static void processIterator(String[] array) {
        List<String> str = Arrays.asList(array);
        ListIterator<String> iterator = str.listIterator();

        while (iterator.hasNext()){
            String current = iterator.next();
            if (current.startsWith("J")){
                current = current.split("J")[1];
                iterator.set(current);
            }
            else {
                iterator.set("");
            }

        }
        while (iterator.hasPrevious()){
            String current = iterator.previous();
            if (!"".equals(current)){
                System.out.println(current);
            }

        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        processIterator(scanner.nextLine().split(" "));
    }
}
