package com.hyperskilldev.Encryptor;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CezarEncryptor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Character> message = scanner.nextLine().chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toList());
        List<Character> alphabet = "abcdefghijklmnopqrstuvwxyz".chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toList());

        int jump = scanner.nextInt();

        ListIterator<Character> iterator = message.listIterator();

        while (iterator.hasNext()) {
            char element = iterator.next();
            if (alphabet.contains(element)) {
                int index = alphabet.indexOf(element);
                index+=jump;

                if (index>alphabet.size()){
                    index-=alphabet.size();
                }
                char ch = alphabet.get(index);
                iterator.set(ch);
            }
        }

        for (char ch : message
        ) {
            System.out.print(ch);
        }






    }
}
