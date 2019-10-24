package com.hyperskilldev.loops;

import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String result = "";

        String firstPart = str.substring(0,str.length()/2);
        String secondPart = str.substring(str.length()/2,str.length());
        int firstSum = 0;
        int secondSum = 0;

        for (int i=0; i<firstPart.length(); i++){
            firstSum += Integer.parseInt(firstPart.substring(i,i+1));
            secondSum += Integer.parseInt(secondPart.substring(i,i+1));
        }

        if (firstSum == secondSum){
            result = "YES";
        } else {
            result = "NO";
        }

        System.out.println(result);

    }
}
