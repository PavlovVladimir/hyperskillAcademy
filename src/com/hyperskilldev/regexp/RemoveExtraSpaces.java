package com.hyperskilldev.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveExtraSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        text = "   The \tJava   language was initially " +
                "called Oak after an oak tree \t\tthat stood     " +
                "outside Gosling's  office. Later the project went    " +
                "by the     name Green   and was " +
                "finally \trenamed Java, \tfrom Java coffee.";
        text=text.replaceAll("^\\s+|\\s+$","").replaceAll("\\s{2,}"," ");
        System.out.println(text);


    }
}
