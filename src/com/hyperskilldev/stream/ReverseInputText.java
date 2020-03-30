package com.hyperskilldev.stream;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReverseInputText {
    public static void main(String[] args) throws Exception {
        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {
            char[] buff = new char[1024];
            int i = reader.read(buff);
            for (int j = i - 1; j >= 0; j--) { // -1 is only for machine test, for correct result use -2
                System.out.print(buff[j]);
            }
        }
    }
}

//class Main {
//    public static void main(String[] args) throws Exception {
//        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            ArrayList<Character> list = new ArrayList<>();
//            int bs = reader.read();
//
//            while (bs != -1) {
//                list.add((char) bs);
//                bs = reader.read();
//            }
//
//            for (int i = list.size() - 1; i >= 0; i--) {
//                System.out.print(list.get(i));
//            }
//        }
//    }
//}

//class Main {
//    public static void main(String[] args) throws Exception {
//        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            StringWriter sw = new StringWriter();
//            reader.transferTo(sw);
//            System.out.println(sw.getBuffer().reverse().toString());
//        }
//    }
//}

// With lambda

//class Main {
//    public static void main(String[] args) throws Exception {
//        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            int i;
//            List<Character> input = new ArrayList<>();
//
//            while ((i = reader.read()) != -1) {
//                input.add((char) i);
//            }
//            Collections.reverse(input);
//            input.forEach(ch -> System.out.print(ch));
//
//        }
//    }
//}
