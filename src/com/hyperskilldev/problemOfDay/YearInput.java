package com.hyperskilldev.problemOfDay;

import java.util.Scanner;

/**
 * import java.time.DateTimeException;
 * import java.time.LocalDate;
 * import java.util.*;
 *
 * class Main {
 *     public static void main(String[] args) {
 *         Scanner scanner = new Scanner(System.in);
 *         String date = scanner.nextLine();
 *
 *         try {
 *             LocalDate.parse(date);
 *             String[] line = date.split("-");
 *             System.out.println(line[1] + "/" + line[2] + "/" + line[0]);
 *         } catch (DateTimeException e) {
 *             System.out.println("Incorrect input");
 *         }
 *     }
 * }
 */
public class YearInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String year = str.split("-")[0];
        String month = str.split("-")[1];
        String day = str.split("-")[2];

        if (Integer.parseInt(year)==0 || Integer.parseInt(month)==0 || Integer.parseInt(day)==0 ||
                Integer.parseInt(month)>12 || Integer.parseInt(day)>31){
            System.out.println("Incorrect input");
        } else {
            System.out.println(month+"/"+day+"/"+year);
        }
    }
}
