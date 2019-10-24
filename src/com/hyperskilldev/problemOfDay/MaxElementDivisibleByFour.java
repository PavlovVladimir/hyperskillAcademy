package com.hyperskilldev.problemOfDay;

import java.util.Scanner;

public class MaxElementDivisibleByFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int maxByFour = 0;
        for (int i = 0; i <= numberOfElements; i++){
            int element = scanner.nextInt();
            int divByFour = element % 4;
            if (divByFour==0 && element>maxByFour){
                maxByFour = element;
            }
        }
        System.out.println(maxByFour);
    }
}
