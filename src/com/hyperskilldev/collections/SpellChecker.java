package com.hyperskilldev.collections;

import java.util.*;

public class SpellChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        SortedSet<String> dictionary = new TreeSet<>();
        SortedSet<String> text = new TreeSet<>();
        SortedSet<String> work = new TreeSet<>();
        for (int i=0; i<=d;i++){
            dictionary.add(scanner.nextLine());
        }

//        System.out.println(dictionary);
        int l = scanner.nextInt();

        for (int i = 0; i <= l; i++){
            Arrays.stream(scanner.nextLine().split("\\s")).forEach(s -> {
                text.add(s);
            });
        }

        work.addAll(text);
//        System.out.println(text);
//        System.out.println(work);

        for (String item:dictionary
             ) {
            for (String txt:text
                 ) {
                if (item.equalsIgnoreCase(txt)){
                    work.remove(txt);
                }
            }
        }

        for (String item:work
             ) {
            System.out.println(item);
        }


    }
}
/**
 * REFERENCE SOLITION
 *
 *
 *
 * import java.util.HashMap;
 * import java.util.Map;
 * import java.util.Scanner;
 *
 * class Main {
 *     public static void main(String[] args) {
 *         Scanner scanner = new Scanner(System.in);
 *
 *         int words = scanner.nextInt();
 *         Map<String, Boolean> dict = new HashMap<>();
 *
 *         for (int i = 0; i < words; i++) {
 *             dict.put(scanner.next().toLowerCase(), true);
 *         }
 *
 *         int lines = scanner.nextInt();
 *         Scanner lineScanner = new Scanner(scanner.nextLine());
 *
 *         for (int i = 0; i < lines; i++) {
 *             lineScanner = new Scanner(scanner.nextLine());
 *             while (lineScanner.hasNext()) {
 *                 dict.putIfAbsent(lineScanner.next().toLowerCase(), false);
 *             }
 *         }
 *
 *         for (Map.Entry<String, Boolean> entry : dict.entrySet()) {
 *             if (!entry.getValue()) {
 *                 System.out.println(entry.getKey());
 *             }
 *         }
 *     }
 * }
 *
 *
 *
 */