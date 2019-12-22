package com.hyperskilldev.collections;

import java.util.*;

class MapsUtils {

    public static NavigableMap<Integer, String> getSubMap(NavigableMap<Integer, String> map){

        if (map.firstKey()%2!=0){
            map = map.subMap(map.firstKey(),true,map.firstKey()+4,true);
        } else {
            map = map.subMap(map.lastKey()-4,true,map.lastKey(),true);
        }
        return map.descendingMap();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Integer, String> map = new TreeMap<>();
        Arrays.stream(scanner.nextLine().split("\\s")).forEach(s -> {
            String[] pair = s.split(":");
            map.put(Integer.parseInt(pair[0]),pair[1]);
        });
        NavigableMap<Integer, String> res = MapsUtils.getSubMap(map);
        res.forEach((k, v) -> System.out.println(k + " : " + v));
    }

}

