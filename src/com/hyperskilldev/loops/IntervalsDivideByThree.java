package com.hyperskilldev.loops;

import java.util.Scanner;

public class IntervalsDivideByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long count = 0L;
        float result = 0;

         for (;a<=b;a++){
             if (a%3==0){
                 result += a;
                 count++;
             }
         }
//        System.out.println(result);
//        System.out.println(count);
         result = result/count;

         System.out.println(result);


    }
}
