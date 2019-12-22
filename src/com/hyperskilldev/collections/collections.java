package com.hyperskilldev.collections;

import java.util.*;

/**
 * List is an ordered collection; its elements can be accessed by indexes like an array.
 *
 Set is a collection that stores a set of unique values, like a mathematical set.

 *
 Queue is a collection that implements the principle "FIFO" (first in, first out).

 *
 Stack  is a collection that implements the principle "LIFO" (last in, first out)

 *Deque (double-ended queue) is a collection that implements both principles "FIFO" and "LIFO" together.
 *
 * Map (dictionary) is a collection that stores key-value pairs.
 *
 * There are also other types of collections, for instance, priority queue, multiset, and others.
 * In a priority queue, an element with high priority is served before an element with low priority.
 * A multiset is a generalization of sets; it can store duplicate elements.
 *
 * The Collection interface
 *
 * The interface Collection<E> is a generic type. It's the base interface for all lists, queues, and sets. You can store elements of the specified type E in these collections.
 *
 * Here are common methods for collections inherited from the interface Collection:
 *
 *     int size() returns the number of elements in this collection
 *     boolean isEmpty() returns true if this collection contains no elements
 *     boolean contains(Object o) returns true if this collection contains the specified element
 *     boolean add(E e) ensures that this collection contains the specified element
 *     boolean remove(Object o)  removes a single instance of the specified element
 *     void clear() removes all elements from this collection
 *
 * Note that methods remove and contain use the method equals of the elements.
 *
 * The interfaces List<E>, Set<E> and Queue<E> inherit all methods of the Collection<E> interface.
 *
 * The Map interface
 *
 * The interface Map<K, V> is also a generic type. It stores key-value pairs. K is the type of keys and V is the type of stored values. This interface is not a subtype of the Collection interface, but maps are often considered as collections.
 *
 * A map cannot contain duplicate keys; each key can map to at most one value (even a collection of values ).
 *
 * Here are common methods for collections inherited from the Map interface:
 *
 *     int size() returns the number of elements in this collection
 *     boolean isEmpty() returns true if this collection contains no elements
 *     boolean containsKey(Object key) returns true if this collection contains the specified key
 *     boolean containsValue(Object value) returns true if this collection contains the specified value
 *     V get(Object key) returns the value to which the specified key is mapped, or null
 *     V put(K key, V value) associates the specified value with the specified key (optional)
 *     V remove(Object key) removes the mapping for a key from this map (optional)
 *     void clear() removes all elements from this collection (optional)
 *     Set<K> keySet() returns a Set view of the keys contained in this map
 *     Collection<V> values() returns a Collection view of the values contained in this map
 *     Set<Map.Entry<K, V>> entrySet() returns a Set view of the mappings contained in this map
 *
 * As you can see, several methods of the Map interface return other collections.
 *
 *
 *Polymorphic utility methods
 * The Java Collections Framework includes the utility class Collections containing a lot of static methods for creating and processing collections. Do not confuse this class and the Collection interface. They are completely different things.
 *
 * The class Collections contains polymorphic algorithms that operate on collections.
 *
 * Let's see some groups of these methods:
 *
 *     creating empty collections: Collections.emptyList(), Collections.emptyMap(), Collections.emptySet() and so on;
 *     creating colections with a single element: Collections.singletonList(T o), Collections.singletonMap(K key, V val), etc;
 *     sorting, shuffling and reversing lists: Collections.sort(List<T> list), Collections.shuffle(List<?> list), Collections.reverse(List<?> list);
 *     check the two collections do not contain common elements: Collections.disjoint(Collection<?> c1, Collection<?> c2);
 *     counting the number of elements equal to the specified object: Collections.frequency(Collection<?> c, Object o);
 *
 * Note, the listed methods have overloaded versions.
 *
 * Of course, it's not all methods here. The class also contains methods for finding max and min values in collections, replacing elements, copying collections, creating an unmodifiable view of collections and so on.
 *
 *
 * List processing example
 *
 * Let's assume we have the collection list containing elements [1, 2, 3, 2, 3, 4].
 *
 * int countInList = Collections.frequency(list, 3); // the count is 2
 *
 * Collections.sort(list); // [1, 2, 3, 2, 3, 4] -> [1, 2, 2, 3, 3, 4]
 *
 * Collections.reverse(list); // [4, 3, 3, 2, 2, 1]
 *
 * Collections.addAll(list, 5, 6, 7); // the list is [4, 3, 3, 2, 2, 1, 5, 6, 7]
 *
 * int max = Collections.max(list); // the max is 7
 *
 * // It's impossible to change the unmodifiable list
 * List<Integer> unmodifiableList = Collections.unmodifiableList(list);
 *
 * Collections.shuffle(unmodifiableList); // it throws UnsupportedOperationException
 *
 * Methods for creating empty and singleton collections also returns unmodifiable collections.
 *
 * Here is an interesting example:
 *
 * List<Integer> singletonList = Collections.singletonList(10);
 *
 * Collections.sort(singletonList); // it doesn't throw an exception
 *
 * Collections.shuffle(singletonList); // it doesn't throw an exception
 *
 * Collections.addAll(singletonList, 1, 2); // it throws the UnsupportedOperationException
 *
 *
 * This example is easy to understand, the sorting and shuffling a list containing one element doesn't require its modification.
 *
 *
 *
 */

public class collections {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(100);
        q.offer(200);
        q.peek();
        q.offer(300);
        q.poll();
        q.offer(400);
        q.peek();
        System.out.println(q.toString());

        List<Integer> numbers = new ArrayList<>();
        Collections.unmodifiableCollection(numbers);
        Collections.unmodifiableCollection(numbers);

        Collections.addAll(numbers, 2, 3);
        Collections.replaceAll(numbers, 4, 5);
        Collections.sort(numbers);
        Collections.frequency(numbers, 10);
        Collections.min(numbers);


    }
}
