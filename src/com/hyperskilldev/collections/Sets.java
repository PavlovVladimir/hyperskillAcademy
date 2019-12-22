package com.hyperskilldev.collections;

import java.util.*;

/**
 * The Set interface
 *
 * The interface Set<E> is a subtype of the java.util.Collection interface.
 * The set inherits all method from the interface Collection but doesn't add any new methods.
 *
 *     int size() returns the number of elements in this collection
 *     boolean isEmpty() returns true if this collection contains no elements
 *     boolean contains(Object o) returns true if this collection contains the specified element
 *     boolean add(E e) adds the specified element to this set if it is not already present
 *     boolean remove(Object o) removes a single instance of the specified element
 *     void clear() Removes all elements from this collection
 *
 * Since Set is an interface you need to instantiate a concrete implementation of the interface in order to use it.
 * There are three general-purpose set implementations: HashSet, LinkedHashSet, TreeSet.
 *
 * Each of these implementations behaves a little differently with respect to the order of the elements when iterating,
 * and the time it takes to insert and access elements in the sets.
 *
 * Also, there is a special-purpose implementation EnumSet. It's a high-performance Set implementation for enum types.
 *
 * HashSet
 *
 * This class implements the Set interface, backed by a hash table. It makes no guarantees as to the
 * iteration order of the set; in particular, it does not guarantee that the order will remain constant over time.
 *
 * This class offers constant time performance for the basic operations (add, remove, contains and size),
 * assuming the hash function disperses the elements properly among the buckets.
 *
 * See the following example:
 *
 * Set<Integer> set1 = new HashSet<>();
 * set1.add(0);
 * set1.add(1);
 * set1.add(2);
 *
 * Set<Integer> set2 = new HashSet<>();
 * set2.add(3);
 * set2.add(2);
 * set2.add(4);
 * set2.add(1);
 *
 * Set<Integer> resultSet = new HashSet<>();
 * resultSet.addAll(set1); // union empty set and [0, 1, 2]
 * resultSet.addAll(set2); // union [0, 1, 2] and [3, 2, 4, 1]
 *
 * System.out.println(resultSet); // contains only unique elements from both sets [0, 1, 2, 3, 4]
 *
 * Remember, this set implementation is unordered.
 *
 *
 *
 * TreeSet
 *
 * The class TreeSet guarantees the order of the elements when iterated. The order is corresponding to
 * the sorting order of the elements determined either by their natural order (if they implement the
 * Comparable interface) or by specific Comparator implementation.
 *
 * In other words, the order in which the elements would be sorted if you used a sort algorithm on a
 * List or Array containing these elements.
 *
 * This class implements the SortedSet interface that extends the base Set interface. The SortedSet interface
 * provides some new operations:
 *
 *     Comparator<? super E> comparator() returns the comparator used to order elements in the set or null
 *     if the set uses the natural ordering of its elements
 *
 *     E first() returns the first (lowest) element in the set
 *     E last() returns the last (highest) element in the set
 *     SortedSet<E> headSet(E toElement) returns a subset containing elements that are strictly less than toElement
 *     SortedSet<E> tailSet(E fromElement) returns a subset containing elements that are greater than or equal
 *     to fromElement
 *     SortedSet<E> subSet(E fromElement, E toElement) returns a subset containing elements in range fromElement
 *     (inclusive) toElement (exclusive)
 *
 * See an example of using this set implementation.
 *
 * SortedSet<Integer> sortedSet = new TreeSet<>();
 * sortedSet.add(10);
 * sortedSet.add(15);
 * sortedSet.add(13);
 * sortedSet.add(21);
 * sortedSet.add(17);
 *
 * System.out.println(sortedSet); // [10, 13, 15, 17, 21]
 *
 * SortedSet<Integer> subSetLessThan16 = sortedSet.headSet(16); // [10, 13, 15]
 *
 * int maxElement = sortedSet.last(); // it is 21
 *
 * Note, HashSet is much faster than TreeSet (constant-time versus log-time for most operations) but offers
 * no ordering guarantees. If you need to use the operations in the SortedSet interface, or if value-ordered
 * iteration is required, use TreeSet, otherwise - HashSet.
 *
 *
 *
 * LinkedHashSet
 *
 * This class implements the Set interface. But It differs from HashSet by guaranteeing that the order of the
 * elements during iteration is the same as the order they were inserted. Reinserting an element that is already
 * in the LinkedHashSet does not change this order.
 *
 * LinkedHashSet is in some sense intermediate between HashSet and TreeSet. Implemented as a hash table with
 * a linked list running through it, it provides insertion-ordered iteration (least recently inserted to most
 * recently) and runs nearly as fast as HashSet. The LinkedHashSet implementation spares its clients from the
 * unspecified, generally chaotic ordering provided by HashSet without incurring the increased cost associated
 * with TreeSet.
 *
 * Here is an example
 *
 * Set<Character> orderedSet = new LinkedHashSet<>();
 *
 * for (char c = 'a'; c <= 'k'; c++) {
 *     orderedSet.add(c);
 * }
 *
 * System.out.println(orderedSet); // the order is always [a, b, c, d, e, f, g, h, i, j, k]
 *
 * Remember, this set implementation is ordered.
 */
public class Sets {
    public static void main(String[] args) {
//        Set<Integer> set1 = new HashSet<>();
//        set1.add(1);
//        set1.add(2);
//        set1.add(3);
//
//        Set<Integer> set2 = new HashSet<>();
//        set2.add(1);
//        set2.add(2);
//        set2.add(3);
//        Set<Integer> set1 = new HashSet<>();
//        set1.add(1);
//        set1.add(2);
//        set1.add(3);
//
//        Set<Integer> set2 = new HashSet<>();
//        set2.add(3);
//        set2.add(2);
//        set2.add(1);
//        Set<Integer> set1 = new HashSet<>();
//        set1.add(1);
//        set1.add(2);
//        set1.add(3);
//
//        Set<Integer> set2 = new LinkedHashSet<>();
//        set2.add(1);
//        set2.add(3);
//        set2.add(2);
//        System.out.println(set1.equals(set2));

//        Set<Integer> set1 = new LinkedHashSet<>();
//        set1.add(1);
//        set1.add(3);
//        set1.add(2);
//
//        Set<Integer> set2 = new LinkedHashSet<>();
//        set2.add(1);
//        set2.add(3);
//
//        SortedSet<Integer> set1 = new TreeSet<>();
//        set1.add(1);
//        set1.add(3);
//
//        Set<Integer> set2 = new LinkedHashSet<>();
//        set2.add(3);
//        set2.add(1);
//
//        System.out.println(set1.equals(set2));

        Set<String> nameSet = new TreeSet<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));

        for (String item:nameSet
             ) {
            System.out.println(item);
        }
    }
}
