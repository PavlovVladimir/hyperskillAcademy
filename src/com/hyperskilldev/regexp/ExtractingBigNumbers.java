package com.hyperskilldev.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractingBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringWithNumbers = scanner.nextLine();

        stringWithNumbers = "If X is 609348676234, Y is 3077, the sum is 609348679311.";

        Pattern bigNumbers = Pattern.compile("\\d{10,}");
        Matcher matcher = bigNumbers.matcher(stringWithNumbers);

        while (matcher.find()) {
            int l = matcher.end() - matcher.start();
            System.out.println(matcher.group() + " : " + l);
        }

    }
}
