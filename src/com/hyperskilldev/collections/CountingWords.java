package com.hyperskilldev.collections;

import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class CountingWords {

    public static SortedMap<String, Integer> wordCount(String[] strings) {
        SortedMap<String,Integer> result = new TreeMap<>();
        Integer count = 1;

        for (int i = 0; i< strings.length;i++){
            for (int j = i+1; j <strings.length ; j++) {
                if (strings[i].equals(strings[j])){
                    count++;
                }
            }
            if (!result.containsKey(strings[i])){
            result.put(strings[i],count);
            }
            count =1;
        }
        return result;
    }

    public static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> item : map.entrySet()) {
            System.out.println(item.getKey() + " : " + item.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        CountingWords.printMap(CountingWords.wordCount(words));
    }
}
