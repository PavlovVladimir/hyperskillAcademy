package com.hyperskilldev.switchcase;

import java.util.Scanner;

public class HarryPotter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String houseMeans = scanner.nextLine();
        String result;

        switch (houseMeans) {
            case "gryffindor":
                result = "bravery";
                break;
            case "hufflepuff":
                result = "loyalty";
                break;
            case "slytherin":
                result = "cunning";
                break;
            case "ravenclaw":
                result = "intellect";
                break;
            default:
                result = "not a valid house";
                break;
        }
        System.out.println(result);
    }
}
