package com.hyperskilldev.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ****************SOLUTION*********************
 *
 * import java.util.Scanner;
 * import java.util.regex.Matcher;
 * import java.util.regex.Pattern;
 *
 * class Main {
 *
 *     public static void main(String[] args) {
 *         Scanner scanner = new Scanner(System.in);
 *
 *         String text = scanner.nextLine();
 *         Matcher matcher = Pattern.compile(
 *             "(?i:(?<=password)[\\s:]*[0-9a-z]+)"
 *         ).matcher(text);
 *
 *         if (matcher.find()) {
 *             do {
 *                 System.out.println(matcher.group().replaceAll("[\\s:]*", ""));
 *             } while (matcher.find());
 *         } else {
 *             System.out.println("No passwords found.");
 *         }
 *     }
 * }
 *
 *
 */
public class FindAllPasswords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        boolean passFind = false;
//       text = "PASSWORD: 1234567 ABDFSDJFJDFHSIF password:SECRETSECRET and and and oeirjorejtoe 834038053 Pass 2394204204 and PAssWoRd PassWord";
       text = "My email javacoder@gmail.com with password    SECRET115. Here is my old PASSWORD: PASS111.";
        text = text.replaceAll(" ",":").trim().replaceAll(":{2,}",":");
        System.out.println(text);

        Pattern pattern = Pattern.compile("password:[a-zA-z0-9]+",Pattern.CASE_INSENSITIVE);
        Matcher isPassword = pattern.matcher(text);

        while (isPassword.find()){
            passFind = true;
            System.out.println(isPassword.group().split(":")[1]);
        }

        if (!passFind){
            System.out.println("No passwords found.");
        }

    }
}
