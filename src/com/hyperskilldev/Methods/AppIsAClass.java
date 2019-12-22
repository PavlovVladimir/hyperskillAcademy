package com.hyperskilldev.Methods;

import java.util.Scanner;

public class AppIsAClass {
    String name ;
    public static void main(String[] args) {


    }
     void run() {
        Scanner scanner = new Scanner(System.in);
       // AppIsAClass app = new AppIsAClass();
     //   app.name = scanner.nextLine();
        String[] arr = scanner.nextLine().split(" ");
         System.out.println(this.name);

    //    System.out.println(app.getClass().getName());
        for (String str:arr
             ) {
            System.out.println(str);
        }
    }
}
