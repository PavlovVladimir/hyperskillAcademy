package com.hyperskilldev.problemOfDay;

import java.util.Scanner;

public class SizeOfParts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        for (int i = 0; i<count;i++){
            int input = scanner.nextInt();
            if (input==1){
                larger++;
                continue;
            }
            if (input==-1){
                smaller++;
                continue;
            }
            if (input==0){
                perfect++;
                continue;
            }

        }
        System.out.println(perfect+" "+larger+" "+smaller);
    }

}
