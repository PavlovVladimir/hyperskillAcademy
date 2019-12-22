package com.hyperskilldev.collections;

import java.util.*;

public class FirstIndexOfSublist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> lst = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));
        List<String> subLst = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));

        System.out.println(Collections.indexOfSubList(lst,subLst)+" "+Collections.lastIndexOfSubList(lst,subLst));

    }
}
