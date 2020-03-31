package com.hyperskilldev.stream;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Let's count how many words contains input string
 */
public class CountWords {
    public static void main(String[] args) throws Exception {
        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {
            char[] buff = new char[1024];
            reader.read(buff);
            String str = String.copyValueOf(buff).trim().replaceAll("( )+", " ");
            String[] result = str.split(" ");
            if (str.length() > 0) {
                System.out.println(result.length);
            } else {
                System.out.println(0);
            }
        }
    }
}
