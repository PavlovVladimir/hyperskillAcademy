package com.hyperskilldev.file;

import java.io.File;
import java.util.Scanner;

public class AreSiblings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path1 = scanner.nextLine();
        String path2 = scanner.nextLine();
        File file1 = new File(path1);
        File file2 = new File(path2);

        if (file1.getParent().equals(file2.getParent())){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
