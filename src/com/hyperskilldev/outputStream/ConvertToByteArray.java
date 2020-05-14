package com.hyperskilldev.outputStream;

import java.io.*;


public class ConvertToByteArray {
    public static void main(String[] args) {
        String[] words = {"This", " ", "is", " ", "a", " ", "test"};
        try {
            writeWords(words);
        } catch (Exception e) {
            System.out.println("Something wrong...");
        }
        File sampleFile = new File("sample.txt");
        String content = "I don't think that";

        try (FileWriter writer = new FileWriter(sampleFile, false)) {
            writer.write(content);
        } catch (Exception e) {
            System.out.println("");
        }
    }

    public static void writeWords(String[] words) throws IOException {
        LetterPrinter printer = new LetterPrinter();

        char[] letters = convert(words);
        for (char letter : letters) {
            printer.write(letter);
        }
    }

    private static char[] convert(String[] words) throws IOException {
        String s = "";
        for (String n : words) {
            s += n;
        }
        return s.toCharArray();
    }
}

class LetterPrinter {
    public void write(char letter) {
        System.out.println(letter);
    }
}