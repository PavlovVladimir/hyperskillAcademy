package com.hyperskilldev.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractingWordsFromText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        text = "All Java programmers program good programs.";

        Pattern pattern = Pattern.compile("([a-z]+)?program([a-z]+)?",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group());
        }
    }
}
