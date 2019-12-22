package com.hyperskilldev.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadTheBiggestNumber {
    public static void main(String[] args) {
//        String pathToFile = "./dataset_91007.txt";
        int count=0;
        Integer next;
//        String pathToFile = "dataset_91022.txt";
        String pathToFile = "dataset_91065.txt";
        File file = new File(pathToFile);

//        Set<Integer> numbers= new HashSet<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                next = scanner.nextInt();
                if(next!=0){numbers.add(next);
                    System.out.println(next);
                } else {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + pathToFile);
        }

//        System.out.println(numbers.last());

        for (Integer item:numbers
             ) {
            if (item==0){
                break;
            }
//            if (item>=9999){
//                count++;
//            }
            if (item%2==0){
                count++;
            }
        }
//        System.out.println("Number are greater than 9999: "+count);
        System.out.println("Четные числа: "+count);

    }
}
