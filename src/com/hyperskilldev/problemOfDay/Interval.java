package com.hyperskilldev.problemOfDay;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        String isInInterval = "False";
        if (x>-15&&x<=12 || x>14&&x<17 || x>=19){
            isInInterval = "True";
        }
        String str ="one";
        int y;
        try {
            y = (int) Integer.parseInt(str);
        }
        catch (NumberFormatException e)
        {
            y = 0;
        }

        System.out.println(isInInterval);
        System.out.println(y);
    }
}
