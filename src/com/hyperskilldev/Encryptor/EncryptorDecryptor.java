package com.hyperskilldev.Encryptor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class EncryptorDecryptor {

    public static int key = 0;
    public static String mode = "enc";
    public static String data = "";
    public static String pathToReadFile = "";
    public static String pathToWriteFile = "";
    public static List<Character> message;
    public static String result = "";
    public static String alghorithm = "shift";

//    public static void printMessage(List<Character> toPrint) {
//        for (char ch : toPrint
//        ) {
//            System.out.print(ch);
//        }
//    }

    public static String resultString(List<Character> toString) {
        for (char ch : toString
        ) {
            result += ch;
        }
        return result;
    }

    public static String readFileAsString(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static void writeFile(String fileName, String text) throws IOException {
        File file = new File(fileName);

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(text);
        } catch (IOException e) {
            System.out.printf("An exception occurs %s", e.getMessage());
        }
    }

    public static List<Character> encryptor(String alghorithm, List<Character> message) {
        switch (alghorithm) {
            case "shift":
                return shiftEncryptor(message);
            case "unicode":
                return unicodeEncryptor(message);
        }
        return message;
    }

    public static List<Character> decryptor(String alghorithm, List<Character> message) {
        switch (alghorithm) {
            case "shift":
                return shiftDecryptor(message);
            case "unicode":
                return unicodeDecryptor(message);
        }
        return message;
    }

    public static List<Character> unicodeDecryptor(List<Character> lst) {
        ListIterator<Character> iterator = lst.listIterator();

        while (iterator.hasNext()) {
            char current = iterator.next();
            current -= key;
            iterator.set(current);
        }
        return lst;

    }

    public static List<Character> unicodeEncryptor(List<Character> lst) {
        ListIterator<Character> iterator = lst.listIterator();

        while (iterator.hasNext()) {
            char current = iterator.next();
            current += key;
            iterator.set(current);
        }
        return lst;

    }

    public static List<Character> shiftDecryptor(List<Character> lst) {
        ListIterator<Character> iterator = lst.listIterator();
        while (iterator.hasNext()) {
            char current = iterator.next();
            int item = (int) current;

            if (item >= 65 && item <= 90) {
                item -= key;
                if (item <= 65) {
                    item = item + 26;
                }
                iterator.set((char) item);
                continue;
            }

            if (item >= 97 && item <= 122) {
                item -= key;
                if (item <= 97) {
                    item = item + 26;
                }
                iterator.set((char) item);
                continue;
            }
        }
        return lst;
    }

    public static List<Character> shiftEncryptor(List<Character> lst) {
        ListIterator<Character> iterator = lst.listIterator();
        while (iterator.hasNext()) {
            char current = iterator.next();
            int item = (int) current;

            if (item >= 65 && item <= 90) {
                item += key;
                if (item >= 90) {
                    item = item - 26;
                }
                iterator.set((char) item);
                continue;
            }

            if (item >= 97 && item <= 122) {
                item += key;
                if (item >= 122) {
                    item = item - 26;
                }
                iterator.set((char) item);
                continue;
            }
        }
        return lst;
    }


    public static void main(String[] args) {
        boolean haveDataTag = false;

        for (int i = 0; i < args.length - 1; i++) {
            String current = args[i];
            if ("-mode".equals(current)) {
                mode = args[i + 1];
                i++;
                continue;
            }
            if ("-key".equals(current)) {
                key = Integer.parseInt(args[i + 1]);
                i++;
                continue;
            }
            if ("-data".equals(current)) {
                data = args[i + 1];
                haveDataTag = true;
                i++;
                continue;
            }
            if ("-in".equals(current)) {
                pathToReadFile = args[i + 1];
                i++;
                continue;
            }
            if ("-out".equals(current)) {
                pathToWriteFile = args[i + 1];
                i++;
                continue;
            }
            if ("-alg".equals(current)) {
                alghorithm = args[i + 1];
                i++;
                continue;
            }
        }

        if (!pathToReadFile.isEmpty() && !haveDataTag) {
            readFileToList();
        } else if (!pathToReadFile.isEmpty() && haveDataTag) {
            message = data.chars()
                    .mapToObj(e -> (char) e)
                    .collect(Collectors.toList());
        } else if (pathToReadFile.isEmpty() && haveDataTag) {
            message = data.chars()
                    .mapToObj(e -> (char) e)
                    .collect(Collectors.toList());
        } else if (pathToReadFile.isEmpty() && !haveDataTag) {
            message = data.chars()
                    .mapToObj(e -> (char) e)
                    .collect(Collectors.toList());
        }


        switch (mode) {
            case "enc":
                result = resultString(encryptor(alghorithm, message));
                break;
            case "dec":
                result = resultString(decryptor(alghorithm, message));
                break;
            default:
                System.out.println("Unknown operation");
                break;
        }

        if (!pathToWriteFile.isEmpty()) {
            try {
                writeFile(pathToWriteFile, result);
            } catch (Exception e) {
                System.out.println("Cannot write file" + pathToWriteFile);
            }
        } else {
            System.out.println(result);
        }
    }

    private static void readFileToList() {
        try {
            message = readFileAsString(pathToReadFile).chars()
                    .mapToObj(e -> (char) e)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Cannot read file" + pathToReadFile);
        }
    }
}


