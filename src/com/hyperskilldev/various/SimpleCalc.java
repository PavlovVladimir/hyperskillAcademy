package com.hyperskilldev.various;

import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean doing = true;

        while (doing) {
            String[] str = scanner.nextLine().split(" ");
            try {
                Integer a = Integer.parseInt(str[0]);
                Integer b = Integer.parseInt(str[2]);

                switch (str[1]) {
                    case "*":
                        System.out.println(a * b);
                        break;
                    case "+":
                        System.out.println(a + b);
                        break;
                    case "-":
                        System.out.println(a - b);
                        break;
                    case "/":
                        System.out.println(a / b);
                        break;
                    case "exit":
                        doing = false;
                        break;
                }
            } catch (Exception e) {
                System.out.println("EXITING...");
                break;
            }
        }
    }
}
