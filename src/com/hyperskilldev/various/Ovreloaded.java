package com.hyperskilldev.various;

public class Ovreloaded {
    public static void print(String stringToPrint) {
        System.out.println(stringToPrint);
    }

    public static void print(String stringToPrint, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(stringToPrint);
        }
    }

    public static void print(int val) {
        System.out.println(val);
    }

    int process(int a, int b) { return 0; }
    int process(int a) { return 0; }
    void process(String a, int b, int c) { }
    //int process(int b, int a) { return 0; }
    int process(boolean a, int b) { return 0; }
   // void process(int a, int b) { }
}
