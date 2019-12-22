package com.hyperskilldev.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProcessingMap1 {
    public static void mapShare(Map<String, String> map) {

        if (map.get("a")!=null){
            map.put("b",map.get("a"));
        }
        map.remove("c");
    }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Map<String, String> map = new HashMap<>();
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                String[] pair = s.split(":");
                map.put(pair[0], pair[1]);
            }
            ProcessingMap1.mapShare(map);
            map.forEach((key, value) -> System.out.println(key + ":" + value));
        }
    }

