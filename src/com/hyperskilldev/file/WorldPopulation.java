package com.hyperskilldev.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WorldPopulation {
    public static void main(String[] args) {
        String pathToFile = "./naselenie.txt";
        File file = new File(pathToFile);
//        Map<Integer,Double> naselenie = new HashMap<>();
        ArrayList<Integer> years = new ArrayList<>();
        ArrayList<Double> peoples = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()){
                String lines = scanner.nextLine();
                lines = lines.replaceAll(",","");
//                System.out.println(lines);
                years.add(Integer.parseInt(lines.split("\t")[0]));
                peoples.add(Double.parseDouble(lines.split("\t")[1]));

 //              naselenie.put(Integer.parseInt(lines.split("\t")[0]),Double.parseDouble(lines.split("\t")[1]));

            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + pathToFile);
        }
        
        int search = 0;
        Double maximum = Double.valueOf(0);
        for (int i = 0; i < peoples.size()-1; i++) {
            if (Math.abs(peoples.get(i) - peoples.get(i + 1))>maximum){
                maximum = Math.abs(peoples.get(i) - peoples.get(i+1));
                search = i+1;
            }
        }
        System.out.println(years.get(search));

//        for (Map.Entry<Integer,Double> item : naselenie.entrySet()){
//            System.out.println(item.getKey()+" : "+item.getValue());
//        }
//        System.out.println(Integer.MAX_VALUE);

    }
}
