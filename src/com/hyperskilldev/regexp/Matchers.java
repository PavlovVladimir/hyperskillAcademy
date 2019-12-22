package com.hyperskilldev.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * Matching a regex
 *
 * Suppose, we have a text stored in a string variable:
 *
 * String text = "We use Java to write modern applications";
 *
 * We need to check whether the text contains "Java" or "java" using a regular expression. There are three stages to do that using Pattern and Matcher classes.
 *
 * 1. Create an object of Pattern passing a regex string to the compile method.
 *
 * Pattern pattern = Pattern.compile(".*[Jj]ava.*"); // regex to match "java" or "Java" in a text
 *
 * 2. Create a Matcher invoking the matcher method of a Pattern to create an object for a given string.
 *
 * Matcher matcher = pattern.matcher(text); // it will match the passed text
 *
 * 3. Invoking the matches method of the matcher to match the string.
 *
 * boolean matches = matcher.matches(); // true
 *
 * The method matches of a Matcher works like the method of the same name of a String.
 *
 Pattern pattern = Pattern.compile(".*java.*", Pattern.CASE_INSENSITIVE);

 Another mode is Pattern.DOTALL that forces the dot . match all characters, including line breaks.

 Note: to use the case-insensitive mode without a Matcher, just add (?i) to the start of a regex. To make the dot character match newlines, add (?s). You can add both modes together like (?is).

 Pattern.matches("(?is).*java.*", "\n\nJAVA\n\n"); // true

 A Matcher also has the find method that is similar to the matches method, but it tries to find a substring
 that matches the pattern instead of matching the whole string. Look at the following example to understand the
 difference between these methods.

 String text = "Regex is a powerful tool for programmers";

 Pattern pattern = Pattern.compile("tool");
 Matcher matcher = pattern.matcher(text);

 System.out.println(matcher.matches()); // false, the whole string does not match the pattern
 System.out.println(matcher.find()); // true, there is a substring that matches the pattern

 We can modify the behavior of the find method to use it like matches if we add special characters to a regular
 expression. To specify the find method should match from the beginning of a string we can add the ^ character
 to the start of a regex. To specify it should match at the end of a string, we can add the $ character to the end of a regex.

 Pattern pattern = Pattern.compile("^tool$");
 Matcher matcher = pattern.matcher(text);

 System.out.println(matcher.matches()); // false
 System.out.println(matcher.find());   // false

 By default, both methods matches and find looks at all characters of a string. But it is possible to specify
 the range to be matched invoking the range method with the start (inclusive) and the end (exclusive) indexes.

 Pattern pattern = Pattern.compile("^tool$");
 Matcher matcher = pattern.matcher(text);

 System.out.println(matcher.matches()); // false
 System.out.println(matcher.find());   // false




 String javaText = "Java supports regular expressions. LET'S USE JAVA!!!";

 Pattern javaPattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
 Matcher matcher = javaPattern.matcher(javaText);

 while (matcher.find()) {
 System.out.println("group: " + matcher.group() + ", start: " + matcher.start());
 }

 This code outputs:

 group: Java, start: 0
 group: JAVA, start: 45
 */
public class Matchers {
    public static void main(String[] args) {
//        String text = "Java supports regular expressions. LET'S USE JAVA!!!";
////
////        Pattern javaPattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
////        Matcher javaMatcher = javaPattern.matcher(text);
////
////        Pattern regexPattern = Pattern.compile(".*regular expression.*");
////        Matcher regexMatcher = regexPattern.matcher(text);
////
////        System.out.println(Pattern.matches(".*java.*", text));
////
////
////        System.out.println(javaMatcher.matches());
////        System.out.println(regexMatcher.find());
////        System.out.println(javaMatcher.find());
////        System.out.println(regexMatcher.matches());

        Scanner scanner = new Scanner(System.in);

//        String part = scanner.nextLine();
//        String line = scanner.nextLine();

 //     Pattern pattern = Pattern.compile("(?i)\\b[a-z]+" + part + "[a-z]+\\b");
 //       Pattern pattern = Pattern.compile("(?i)\\b" + part + "\\b");
//        Pattern pattern = Pattern.compile(("\\b"+part+"|"+part+"\\b")); //its right
//        Pattern pattern1 = Pattern.compile("[a-z]?"+part+"\\W",Pattern.CASE_INSENSITIVE);
////        Pattern pattern2 = Pattern.compile("\\W"+part+"\\b",Pattern.CASE_INSENSITIVE);
////        Matcher matcher1 = pattern1.matcher(line);
////        Matcher matcher2 = pattern2.matcher(line);
////
////        System.out.println(matcher1.find());
////        System.out.println(matcher2.find());
//        Matcher matcher = pattern.matcher(line);
//        System.out.println(matcher.find());

 //       System.out.println(matcher1.find() ? "YES" : "NO");

 /*       int size = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\b[A-Za-z]{"+ size + "}\\b");
        Matcher matcher = pattern.matcher(line);

        System.out.println(matcher.find());

  */

//        String javaText = "Java supports regular expressions. LET'S USE JAVA!!!";
//
//        Pattern javaPattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
//        Matcher matcher = javaPattern.matcher(javaText);
//
//        System.out.println(matcher.find()); // prints "true"
//        System.out.println(matcher.start()); // 0, the starting index of match
//        System.out.println(matcher.end());   // 4, the index followed the last index of match
//        System.out.println(matcher.group()); // "Java", a substring that matches the pattern



    }
}
