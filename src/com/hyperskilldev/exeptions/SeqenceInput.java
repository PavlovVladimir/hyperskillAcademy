package com.hyperskilldev.exeptions;
/**
 * return str == null ? "" : str.toUpperCase();
 */

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class SeqenceInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        int n=0;
        do {
            str = scanner.next();
            try{
                n = Integer.parseInt(str)*10;
                if (n==0){break;}
            } catch (Exception e){
                System.out.println("Invalid user input: "+str);
                continue;
            }
            System.out.println(n);
        }while(n!=0);
    }
    public static boolean toPrimitive(Boolean b) {
        boolean c = true;
       try {
           return c = !b.equals(null)&&b;
       } catch (Exception e){
           return false;
       }
    }

    public static int convert(Double val) {
        double result;
        try {
            result = val;
        } catch (Exception e) {
            return 0;
        }
        if (val.equals(Double.POSITIVE_INFINITY)){
        return (int)Integer.MAX_VALUE;
        }
        if (val.equals(Double.NEGATIVE_INFINITY)){
            return (int)Integer.MIN_VALUE;
        }
        return (int)result;
    }
    Long val = Long.parseLong("4321");
    Long val1 = 4321L;
    Long val2 = new Long(4321);
    Long val3 = new Long("4321");
}
