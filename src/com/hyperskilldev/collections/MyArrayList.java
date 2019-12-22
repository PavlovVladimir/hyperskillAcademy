package com.hyperskilldev.collections;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ArrayList<String> list = new ArrayList<>(anotherList);
 * ArrayList<String> list = new ArrayList<>(50);
 *
 * Basic methods
 *
 * The collection has a set of convenient methods which emulate and extend the functionality of standard arrays.
 *
 *     int size() return the number of elements of the list;
 *     Object get(int index) returns the object of the list which is present at the specified index;
 *     add(Object o) adds a passed element to the last position of the collection;
 *     add(int index, Object o) adds a passed element to the specified position of the collection;
 *     set(int index, Object o) replaces the element present at the specified index with the object;
 *     remove(Object o) removes the object from the array;
 *     remove(int index) removes element from a given index;
 *     clear() removes all elements from the collection.
 */
public class MyArrayList {

        public static void main(String[] args) {
            ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
            for (String name:nameList
                 ) {
                System.out.println(name);
            }

    }
    public static ArrayList<Integer> concatPositiveNumbers(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> result = new ArrayList<>();
            for (Integer item:l1
             ) {
            if (item>0){
                result.add(item);
            }
        }
        for (Integer item:l2
        ) {
            if (item>0){
                result.add(item);
            }
        }
            return result; // write your code here
    }
}
