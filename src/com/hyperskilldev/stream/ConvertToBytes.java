package com.hyperskilldev.stream;

import java.io.InputStream;

public class ConvertToBytes {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        byte[] bytes = inputStream.readAllBytes();
        for (byte item : bytes) {
            System.out.print(item);
        }
    }
}

//class Main {
//    public static void main(String[] args) throws Exception {
//        InputStream inputStream = System.in;
//
//        int inputByte;
//        ArrayList<Integer> arr = new ArrayList<>();
//
//        while ((inputByte = inputStream.read()) != 0x0a && inputByte != -1) {
//            arr.add(inputByte);
//        }
//
//        arr.forEach(System.out::print);
//        inputStream.close();
//    }
//
//}


//class Main {
//    public static void main(String[] args) throws Exception {
//        InputStream inputStream = System.in;
//        StringBuilder sb = new StringBuilder();
//        int c;
//        while ((c = inputStream.read()) >= 0) {
//            sb.append(c);
//        }
//        System.out.println(sb);
//    }
//}