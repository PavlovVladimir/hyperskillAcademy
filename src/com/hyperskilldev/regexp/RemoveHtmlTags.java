package com.hyperskilldev.regexp;

import java.util.Scanner;

public class RemoveHtmlTags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringWithHTMLTags = scanner.nextLine();
        stringWithHTMLTags = "<h2>Header with <b>bold</b> text</h2>";
        stringWithHTMLTags=stringWithHTMLTags.replaceAll("<.*?>","");
        System.out.println(stringWithHTMLTags);
    }
}
