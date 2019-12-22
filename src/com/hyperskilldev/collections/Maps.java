package com.hyperskilldev.collections;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * What are maps
 * Map is a collection that stores key-value pairs. A map can not contain duplicate keys, but values can repeat.
 *
 *
 * In a sense, a map can be considered as "extended" array because the key is similar to index but it can be of any type, including integer numbers, strings and so on.
 *
 * In the real world, a good example of a map is a phone book where keys are names of your friends and values are their phones.
 *
 *
 * Keys : Values
 *
 *
 *
 * Bob : +1-202-555-0118
 *
 * James : +1-202-555-0118
 *
 * Katy : +1-202-555-0175
 *
 *
 * Important, you need a correct implementation of equals and hashcode if you'd like use objects of your custom class as a map keys.
 *
 * The Map interface
 * The interface Map<K, V> is a generic type, where K is the type of keys and V is the type of stored values. The interface is not a subtype of the Collection interface, but maps are often considered as collections.
 *
 * A map cannot contain duplicate keys; each key can map to at most one value (even, a collection of values).
 *
 * The interface declares a lot of methods, here are some of them:
 *
 *     int size() returns the number of elements in this collection
 *     boolean isEmpty() Returns true if this collection contains no elements
 *     boolean containsKey(Object key)  Returns true if this collection contains the specified key
 *     boolean containsValue(Object value) Returns true if this collection contains the specified value
 *     V get(Object key) returns the value to which the specified key is mapped, or null
 *     V put(K key, V value) associates the specified value with the specified key
 *     V remove(Object key) removes the mapping for a key from this map
 *     void clear() removes all elements from this collection
 *     Set<K> keySet() returns a Set view of the keys contained in this map
 *     Collection<V> values() returns a Collection view of the values contained in this map
 *     Set<Map.Entry<K, V>> entrySet() returns a Set view of the pairs contained in this map
 *     V putIfAbsent(K key, V value) - if the specified key is not already associated with a value (or is mapped to null) associates it with the given value and return null, otherwise - returns the current value
 *     V getOrDefault(Object key, V defaultValue) returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key
 *
 * The Standard Class Library provides a lot of the interface implementations. We will consider only the most commonly used implementations: HashMap, TreeMap and LinkedHashMap.
 *
 * HashMap
 * The HashMap implements the base Map interfaces. It does not guarantee any order of the elements stored internally in the map.
 *
 * This implementation provides constant-time performance for the basic operations (get and put), assuming the hash function disperses the elements properly among the buckets.
 *
 * Map<Integer, String> products = new HashMap<>(); // unordered map of products
 *
 * products.put(1000, "Notebook");
 * products.put(2000, "Phone");
 * products.put(3000, "Keyboard");
 *
 * System.out.println(products); // {2000=Phone, 1000=Notebook, 3000=Keyboard}
 *
 * String notebook = products.get(1000); // "Notebook"
 * String noSuchProduct = products.get(4000); // it's null
 *
 * // iterating over pairs of the map
 * for (Map.Entry<Integer, String> product : products.entrySet()) {
 *     System.out.println(product.getKey() + ": " + product.getValue());
 * }
 *
 * // iterating over values of the map
 * for (String productName : products.values()) {
 *     System.out.println(productName);
 * }
 *
 *
 * Remember, this implementation is unordered.
 *
 * LinkedHashMap
 * It extends HashMap class. It creates a linked list of elements in the map, located in the order in which they were inserted.
 *
 * Let's see a part of the previous example again:
 *
 * Map<Integer, String> products = new LinkedHashMap<>(); // ordered map of products
 *
 * products.put(1000, "Notebook");
 * products.put(2000, "Phone");
 * products.put(3000, "Keyboard");
 *
 * System.out.println(products); // it's always ordered {1000=Notebook, 2000=Phone, 3000=Keyboard}
 *
 *
 * Remember, this map implementation is ordered.
 *
 * TreeMap
 *
 * The class TreeMap guarantees the order of the elements when iterated. The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time, depending on which constructor is used.
 *
 * This class implements the SortedMap interface that extends the base Map interface. The SortedMap interface provides some new methods:
 *
 *     Comparator<? super K> comparator() returns the comparator used to order elements in the set or null if the map uses the natural ordering of its elements
 *     E firstKey() returns the first (lowest) key in the map
 *     E lastKey() returns the last (highest) key in the map
 *     SortedMap<K, V> headMap(K toKey) returns a submap containing elements whose keys are strictly less than toKey
 *     SortedMap<K, V> tailMap(K fromKey) returns a submap containing elements whose keys are greater than or equal to fromKey
 *     SortedMap<K, V> subMap(K fromKey, E toKey) returns a submap containing elements whose keys in range fromKey (inclusive) toKey (exclusive)
 *
 *
 * In the following example, an instance of TreeMap is created and filled with events. Each event has a date (key) and title (value).
 *
 * SortedMap<LocalDate, String> events = new TreeMap<>();
 *
 * events.put(LocalDate.of(2017, 6, 6), "The Java Conference");
 * events.put(LocalDate.of(2017, 6, 7), "Another Java Conference");
 * events.put(LocalDate.of(2017, 6, 8), "Discussion: career or education?");
 * events.put(LocalDate.of(2017, 6, 9), "The modern art");
 * events.put(LocalDate.of(2017, 6, 10), "Coffee master class");
 *
 * LocalDate fromInclusive = LocalDate.of(2017, 6, 8);
 * LocalDate toExclusive = LocalDate.of(2017, 6, 10);
 *
 * System.out.println(events.subMap(fromInclusive, toExclusive));
 *
 *
 * Note, LocalDate.of(year, month, day) creates the specified date object with the given year, month and day.
 *
 * The code outputs the resulting submap:
 *
 * {2017-06-08=Discussion: career or education?, 2017-06-09=The modern art}
 *
 */
public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Gamma",  3);
        map.put("Omega", 24);
        map.put("Alpha",  1);

        for (Map.Entry<String, Integer> item : map.entrySet()) {
            System.out.println(item.getKey() + "=" + item.getValue());
        }
    }

}
