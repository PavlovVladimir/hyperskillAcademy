package com.hyperskilldev.switchcase;

import java.util.Scanner;

public class MaleviaFloorSpace {
    private static final double pi = 3.14;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        double squre;

        switch (shape){
            case "triangle":
                double a = scanner.nextInt();
                double b = scanner.nextInt();
                double c = scanner.nextInt();
                double p = (a+b+c)/2;
                squre = Math.sqrt(p*(p-a)*(p-b)*(p-c));
                break;
            case "rectangle":
                double d = scanner.nextInt();
                double e = scanner.nextInt();
                squre = d*e;
                break;
            default:
                double r = scanner.nextDouble();
                squre = pi*r*r;
                break;
        }
        System.out.println(squre);

    }
}
