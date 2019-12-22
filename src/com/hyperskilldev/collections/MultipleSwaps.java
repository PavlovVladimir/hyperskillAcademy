package com.hyperskilldev.collections;

import java.util.*;

public class MultipleSwaps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> lst = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            Collections.swap(lst, scanner.nextInt(), scanner.nextInt());
        }

        for (String item : lst) {
            System.out.print(item + " ");
        }

    }
}
