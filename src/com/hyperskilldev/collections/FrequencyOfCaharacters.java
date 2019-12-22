package com.hyperskilldev.collections;

import java.util.*;

public class FrequencyOfCaharacters {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String[] strArray = scanner.nextLine().split(" ");
        str = Arrays.asList(strArray);
        String check =scanner.nextLine();
        int frequency = Collections.frequency(str,check);
        System.out.println(frequency);
    }
}
