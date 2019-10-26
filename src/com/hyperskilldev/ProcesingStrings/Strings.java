package com.hyperskilldev.ProcesingStrings;
/**
 * char[] chars = { 'A', 'B', 'C', 'D', 'E', 'F' };
 *
 * String stringFromChars = String.valueOf(chars); // "ABCDEF"
 *
 * char[] charsFromString = stringFromChars.toCharArray(); // { 'A', 'B', 'C', 'D', 'E', 'F' }
 *
 * String theSameString = new String(charsFromString); // "ABCDEF"
 *
 * A string can be separated by delimiters to an array of strings. To perform this, call the method split passing a string for splitting.
 *
 * String text = "a long text";
 * String[] parts = text.split(" "); // [a, long, text]
 *
 * String scientistName = "Isaac Newton";
 *
 * for (int i = 0; i < scientistName.length(); i++) {
 *     System.out.print(scientistName.charAt(i) + " "); // print the current character
 * }
 *
 * The code outputs:
 *
 * I s a a c   N e w t o n
 */
public class Strings {
    public static void main(String[] args) {
//        String str = "Hello, Java";
//
//        int i = str.length() - 1;
//        while (i >= 1) {
//            System.out.print(str.charAt(i));
//            i--;
//        }

        String str1 = "aaabbcccdaa";
        String str2 = " ";

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch != str2.charAt(str2.length() - 1)) {
                str2 += ch;
            }
        }
        System.out.println(str2);
    }
}
