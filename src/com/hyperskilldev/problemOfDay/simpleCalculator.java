package com.hyperskilldev.problemOfDay;

import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first = scanner.nextDouble();
        String operator = scanner.next();
        double second = scanner.nextDouble();


        switch (operator){
            case "+":
                System.out.printf( "%.0f%n",first+second);
                break;
            case "-":
                System.out.printf( "%.0f%n",first-second);
                break;
            case "*":
                System.out.printf( "%.0f%n",first*second);
                break;
            case "/":
                if (second==0){
                    System.out.println("Division by 0!");
                    break;
                }else{
                    System.out.printf( "%.0f%n",first/second);
                    break;
                }

            default:
                System.out.println("Unknown operator");
                break;
        }


    }
}
