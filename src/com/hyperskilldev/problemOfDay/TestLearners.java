package com.hyperskilldev.problemOfDay;

import java.util.Scanner;

public class TestLearners {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Question: what programming language are you learning here?");
        System.out.println("1. Java");
        System.out.println("2. Kotlin");
        System.out.println("3. Scala");
        System.out.println("4. Python");
        int intAnswer = scanner.nextInt();
        String answer;
        switch (intAnswer) {
            case 1:
                answer = "Yes!";
                break;
            case 2:
                answer = "No!";
                break;
            case 3:
                answer = "No!";
                break;
            case 4:
                answer = "No!";
                break;
            default:
                answer = "Unknown number";
                break;
        }
        System.out.println(answer);
    }
}
