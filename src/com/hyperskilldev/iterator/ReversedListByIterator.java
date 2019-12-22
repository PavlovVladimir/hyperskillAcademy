package com.hyperskilldev.iterator;

import java.util.*;
import java.util.stream.Collectors;

public class ReversedListByIterator {
    public static <T> List<T> createReversedListByIterator(ListIterator<T> iterator) {
        List<T> list = new ArrayList<>();
        while (iterator.hasNext()){
            iterator.next();
        }

        //list.add(iterator.previous());
        while (iterator.hasPrevious()){
            list.add(iterator.previous());
        }

        return list;
    }

    /* Do not change the code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        createReversedListByIterator(list.listIterator())
                .forEach(e -> System.out.print(e + " "));
    }
}
