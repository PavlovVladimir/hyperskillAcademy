package com.hyperskilldev.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadingFileDemo {

    public static String readFileAsString(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static void main(String[] args) {
        String pathToHelloWorldJava = "C:\\Android\\PROJECTS\\activity_profile.xml";
        try {
            System.out.println(readFileAsString(pathToHelloWorldJava));
        } catch (IOException e) {
            System.out.println("Cannot read file: " + e.getMessage());
        }
    }
}
