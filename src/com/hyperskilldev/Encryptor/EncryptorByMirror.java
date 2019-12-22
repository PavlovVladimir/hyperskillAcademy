package com.hyperskilldev.Encryptor;

import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class EncryptorByMirror {
    public static void main(String[] args) {

        List<Character> message = "we found a treasure!".chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toList());
        List<Character> alphabet = "abcdefghijklmnopqrstuvwxyz".chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toList());
        List<Character> alphabetReversed = "zyxwvutsrqponmlkjihgfedcba".chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toList());

        ListIterator<Character> iterator = message.listIterator();

        while (iterator.hasNext()) {
            char element = iterator.next();
            if (alphabet.contains(element)) {
                int index = alphabet.indexOf(element);
                char ch = alphabetReversed.get(index);
                iterator.set(ch);
            }
        }

        for (char ch : message
        ) {
            System.out.print(ch);
        }

    }

}
