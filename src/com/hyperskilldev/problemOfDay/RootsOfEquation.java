package com.hyperskilldev.problemOfDay;

import java.util.Scanner;

public class RootsOfEquation {
    public static void main(String[] args) {
        long a;
        long b;
        long c;
        long d;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLong();
        b = scanner.nextLong();
        c = scanner.nextLong();
        d = scanner.nextLong();

        for (int x = 0; x <=1000; x++){
            if (a*x*x*x+b*x*x+c*x+d==0){
                System.out.println(x);
            }
        }
    }
}
