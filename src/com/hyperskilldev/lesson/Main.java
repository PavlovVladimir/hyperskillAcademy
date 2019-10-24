package com.hyperskilldev.lesson;

import java.util.Scanner;
/**
 '\n' is the newline character;
 '\t' is the tab character;
 '\r' is the carriage return character;
 '\\' is the backslash character itself;
 '\'' is the single quote mark;
 '\"' is the double quote mark.
*/

/**
 *
 isEmpty() returns true if the string is empty, otherwise - false;
 toUpperCase() returns a new string in uppercase;
 toLowerCase() returns a new string in lowercase;
 startsWith(prefix) returns true if the string starts with the given string prefix, otherwise - false;
 endsWith(suffix) returns true if the string ends with the given string suffix, otherwise, false.
 contains(...) returns true if the string contains the given string or character;
 substring(beginIndex, endIndex) returns a substring of the string in the range: beginIndex, endIndex - 1;
 replace(old, new) returns a new string obtained by replacing all occurrences of old with new that can be chars or strings.

 String has two convenient methods for comparing the equivalence of the actual content
 of one string with the content of another string: equals(other) and equalsIgnoreCase(other). See an example below.
 */
 class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        int d = scanner.nextInt();
//
//        System.out.println(--a+" "+--b+" "+--c+" "+--d);

//        char c = 'Q';
//       System.out.println( Character.isLetter(c));
//        System.out.println( Character.isLowerCase(c));
//        System.out.println( Character.isDigit(c));
//        System.out.println( Character.isLetterOrDigit(c));
//        String simpleString = "It is a simple string"; // a simple string
//        System.out.println(simpleString);  // it prints "It is a simple string"
//
//        String str = "a simple string";
//
//        if (str.startsWith("A simple")) {
//            str = str.substring(2, 8);
//        } else {
//            str = str.replace("a", "A SIMPLE").substring(2, 8);
//        }
//        System.out.println(str);

//        Scanner scanner = new Scanner(System.in);
//
//        String str = scanner.nextLine();
////        String strFirst = str.substring(0,1);
////        boolean b = strFirst.equalsIgnoreCase("J");
//
//        System.out.println(str.endsWith("burg"));
        Scanner scanner = new Scanner(System.in);
        String commandString = scanner.nextLine();

        String str1 = commandString.substring(0,3);
        String str2 = commandString.substring(3,6);
        String str3 = commandString.substring(6,9);



        System.out.println("---------");
        System.out.println("| "+str1.substring(0,1)+" "+str1.substring(1,2)+" "+str1.substring(2,3)+" |");
        System.out.println("| "+str2.substring(0,1)+" "+str2.substring(1,2)+" "+str2.substring(2,3)+" |");
        System.out.println("| "+str3.substring(0,1)+" "+str3.substring(1,2)+" "+str3.substring(2,3)+" |");
        System.out.print("---------");
        System.out.println("9 8 7 6 5 4 3 2 1 0");
    }
}