package com.hyperskilldev.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SumOfIntegersFromFile {
    public static void main(String[] args) {
        Integer sum =0;
        String pathToFile ="./dataset_91033.txt";
        File file = new File(pathToFile);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                sum+=Integer.parseInt(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + pathToFile);
        }
        System.out.println(sum);

    }
}
