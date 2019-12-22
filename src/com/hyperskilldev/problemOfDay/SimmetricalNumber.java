package com.hyperskilldev.problemOfDay;

import java.util.Scanner;

public class SimmetricalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        while (numbers.length()<4){
            numbers+="0"+numbers;
        }

        char[] arr = numbers.toCharArray();
        if ((arr[0]==arr[3])&&(arr[1]==arr[2])){
            System.out.println("1");
        } else {
            System.out.println("4");
        }

    }
}
