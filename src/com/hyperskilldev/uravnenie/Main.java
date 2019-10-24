package com.hyperskilldev.uravnenie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a1 = scanner.next();
        String a2 = scanner.next();
        String a3 = scanner.next();
        String a4 = scanner.next();
        String a5 = scanner.next();
        int result = 0;

        // case 1 x is first
        if (a1.equalsIgnoreCase("x")){
            if (a2.equalsIgnoreCase("=")){
                result = Integer.parseInt(a3) + Integer.parseInt(a4+a5);
            } else {
                result = Integer.parseInt(a5) - Integer.parseInt(a2+a3);
            }
        }

        // case 2 x is fifth
        if (a5.equalsIgnoreCase("x")){
            if (a4.equalsIgnoreCase("=")){
                result = Integer.parseInt(a1) + Integer.parseInt(a2+a3);
            } else {
                if (a4.equalsIgnoreCase("+")){
                    result = Integer.parseInt(a1) - Integer.parseInt(a3);
                } else {
                    result = Integer.parseInt(a3) - Integer.parseInt(a1);
                }
            }
        }

        //case 3 x is third
        if ("x".equalsIgnoreCase(a3)){
            if (a2.equalsIgnoreCase("+")){
                result = Integer.parseInt(a5) - Integer.parseInt(a1);
            } else if (a2.equalsIgnoreCase("-")) {
                result = Integer.parseInt(a1) - Integer.parseInt(a5);
            } else if (a2.equalsIgnoreCase("=")){
                result = Integer.parseInt(a1) - Integer.parseInt(a4+a5);
            }
        }


        System.out.print (result);
    }
}
