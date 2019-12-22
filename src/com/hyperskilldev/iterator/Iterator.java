package com.hyperskilldev.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Iterable
 *
 * The interface Collection extends the interface Iterable. Implementing this interface allows an object to be the target of the for-each loop. The order of elements when iterating is specific to a concrete collection.
 *
 *
 *
 * Collection<String> strings = Arrays.asList("first", "second", "third");
 *
 * // iterating over collection using the "for-each" loop
 * for (String elem : strings) {
 *     System.out.println(elem);
 * }
 *
 *
 *
 * Since Java 8 the interface Iterable has three methods (before, only one). One of them is iterator() returning Iterator<T>. All collections that inherit the Collection interface has this method (Maps don't have this method).
 * Iterator
 *
 * The iterator is a universal mechanism for iterating over collections regardless of their structure. It's possible to remove elements from the underlying collection during the iteration.
 *
 *
 *
 * Some methods of the Iterator<E> interface:
 *
 *     boolean hasNext() returns true if the iteration has more elements, otherwise - false
 *     E next() returns the next element in the iteration
 *     void remove() removes from the collection the last element returned by this iterator
 *
 *
 *
 * The typical usage of the iterator includes three steps:
 *
 *     check the collection has next element
 *     obtain the next element
 *     processing the obtained element
 *
 * For example, let's remove all elements less than 10 from a set.
 *
 * Set<Long> set = new TreeSet<>(); // sorted set
 * set.add(10L);
 * set.add(5L);
 * set.add(18L);
 * set.add(14L);
 * set.add(9L);
 *
 * System.out.println(set); // [5, 9, 10, 14, 18]
 *
 * Iterator<Long> iter = set.iterator();
 * while (iter.hasNext()) {
 *     Long current = iter.next();
 *     if (current < 10) {
 *         iter.remove();
 *     }
 * }
 *
 * System.out.println(set); // [10, 14, 18]
 *
 * The iterator allows you to remove elements from the collection but you can't do it inside the "for-each" loop.
 *
 * Important, an iterator iterates over a collection in order depending on the order of elements of the collection. In the example above, the iterator gets elements according to sorting order (because of TreeSet).
 * ListIterator
 *
 * It's an iterator only for lists that allows the programmer to traverse the list in either direction, modify the list during iteration, and obtain the iterator's current position in the list. This iterator has no current element; its cursor position always lies between the element that would be returned by a call to previous() and the element that would be returned by a call to next().
 *
 * Here is an example.
 *
 * ListIterator<Integer> listIterator = list.listIterator(); // only for lists!
 * while (listIterator.hasPrevious()){
 *     System.out.println(listIterator.previous() +" on "+ listIterator.previousIndex());
 * }
 */


public class Iterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        ListIterator<Integer> listIterator = list.listIterator(); // only for lists!
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous() +" on "+ listIterator.previousIndex());
        }
    }
}
