package com.hyperskilldev.collections;

import java.util.*;

class SetUtils {

    /**
     * @return symmetric difference between set1 and set2
     */
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> result = new HashSet<T>(set1);
        result.addAll(set2);
        Set<T> tmp = new HashSet<T>(set1);
        tmp.retainAll(set2);
        result.removeAll(tmp);
        return result;
    }



/* Do not change code below */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strSet1 = scanner.nextLine();
        String strSet2 = scanner.nextLine();
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        if (!strSet1.equals("empty")){
            Collections.addAll(set1, strSet1.split(" "));
        }
        if (!strSet2.equals("empty")){
            Collections.addAll(set2, strSet2.split(" "));
        }
        Set<String> resultSet = SetUtils.symmetricDifference(set1, set2);
        resultSet.forEach(e -> System.out.print(e + " "));
    }
}