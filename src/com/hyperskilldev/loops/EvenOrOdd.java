package com.hyperskilldev.loops;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
             int i = 1;
             String result = "";
             while (i>0){
                 i = scanner.nextInt();
                 if (i==0){
                     break;
                 }
                 if (i%2==0){
                     System.out.println("even");
                 }else {
                     System.out.println("odd");
                 }
         }

    }
}
