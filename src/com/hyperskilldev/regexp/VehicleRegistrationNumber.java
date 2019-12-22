package com.hyperskilldev.regexp;

import java.util.Scanner;

public class VehicleRegistrationNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "[ABEKMHOPCTYX]{1}[0-9]{3}[ABEKMHOPCTYX]{2}";
        String number = scanner.nextLine();
        System.out.println(number.matches(regex));
    }
}
