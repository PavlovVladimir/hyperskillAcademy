package com.hyperskilldev.collections;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetUtils2 {
    public static Set<Integer> getSetFromString(String str) {
        Set <Integer> result = new TreeSet<>();
        Arrays.stream(str.split("\\s")).forEach(s -> {
            result.add(Integer.parseInt(s));
        });
        return result;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        Set <Integer> result = new TreeSet<>();
        for (Integer item:set){
            if (item<=10){
                result.add(item);
            }
        }
        set.clear();
        set.addAll(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        Set<Integer> set = SetUtils2.getSetFromString(numbers);
        SetUtils2.removeAllNumbersGreaterThan10(set);
        set.forEach(e -> System.out.print(e + " "));
    }
}
