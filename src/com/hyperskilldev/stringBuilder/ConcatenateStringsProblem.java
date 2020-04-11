package com.hyperskilldev.stringBuilder;

import java.util.Scanner;
import java.util.stream.Stream;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String item : strings) {
            stringBuilder.append(item);
        }
        return stringBuilder.toString().replaceAll("[0-9]", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = Stream
                .of(scanner.nextLine().split("\\s+"))
                .toArray(String[]::new);

        String result = concatenateStringsWithoutDigits(strings);

        System.out.println(result);
    }
}
