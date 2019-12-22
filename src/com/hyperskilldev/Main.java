package com.hyperskilldev;

import java.util.Scanner;

/**
 * class Patient {
 *
 *     String name;
 *     int age;
 *     float height;
 *
 *     public Patient(String name, int age, float height) {
 *         this.name = name;
 *         this.age = age;
 *         this.height = height;
 *     }
 * }
 */
public class Main {

    public static void main(String[] args) {
        String str = null;
        System.out.println("OXX");
        System.out.println("OXO");
        System.out.print("XOX");
        int a = 1, b = 2, c = 3, d = 4;
       // int[] numbers = { a, b, c, d }; // an array of 1, 2, 3, 4
        float[] floatNumbers; // declaration
        floatNumbers = new float[] { 1.02f, 0.03f, 4f }; // instantiation and initialization
        int length = floatNumbers.length;
      //  char[] array = { 'a', 'b', 'c', 'd' };
       //char[] array = new char[10000000000000];
      //  char[] array = new char[-1];
      //  char[] array = new char[0];
        char[] array = new char[1];
        long[] longNumbers = {100000000001L, 100000000002L, 100000000003L};
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.next();
        String s2 = scanner.next();
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(i1);
        System.out.println(i2);

    }
}
