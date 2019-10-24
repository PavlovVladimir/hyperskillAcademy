package com.hyperskilldev.problemOfDay;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        //int year100 = year/100;
        boolean isLeap = false;
        String result;

        if (year%400==0){
            isLeap = true;
        } else if (year%4==0&&year%100!=0){
            isLeap = true;
        }

        if (isLeap){
            result = "Leap";
        } else {
            result = "Regular";
        }
        System.out.println(result);

    }
}
