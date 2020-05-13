package com.hyperskilldev.numericalSystems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ConvertingFractions {

    public static void main(String[] args) {
        Data data = new Data();
        try {
            data.getDataFromCLI();
            data.computeRadix();
            data.computeDecimalVariables();
            data.computeTargetVariables();
            printNumber(data.targetNumber, data.targetFraction);
        } catch (Exception e) {
            System.out.println("Error!! You have mistake in input! " + e);
        }
    }

    public static void printNumber(String number, String fraction) {
        if (fraction.equals("")) {
            System.out.println(number);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(number).append(".").append(fraction);
            System.out.println(sb);
        }
    }
}

class Data {
    String stringSourceRadix = "";
    String stringSourceNumber = "";
    String stringTargetRadix = "";
    String stringSourceFraction = "";

    boolean isNumberFractional = false;

    Integer sourceRadix;

    Integer decimalNumber;
    String decimalFractionString = "";

    Integer targetRadix;
    String targetNumber = "";
    String targetFraction = "";
    ArrayList<Character> alphabet = new ArrayList<>(Arrays.asList('0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'));

    public void getDataFromCLI() {
        Scanner scanner = new Scanner(System.in);

        stringSourceRadix = scanner.nextLine().toUpperCase();
        stringSourceNumber = scanner.nextLine().toUpperCase();
        stringTargetRadix = scanner.nextLine().toUpperCase();

        if (stringSourceNumber.contains(".")) {
            stringSourceFraction = stringSourceNumber.split("\\.")[1];
            stringSourceNumber = stringSourceNumber.split("\\.")[0];
            isNumberFractional = true;
        }
    }

    void computeRadix() throws Exception {
        try {
            sourceRadix = Integer.parseInt(stringSourceRadix);
            targetRadix = Integer.parseInt(stringTargetRadix);
            if (radixIsNotRight()) {
                throw new Exception("Radix must be between 1 and 36");
            }
        } catch (Exception e) {
            System.out.println("Your input was wrong: " + e);
            throw new Exception("Radix must be between 1 and 36");
        }
    }

    private boolean radixIsNotRight() {
        boolean b = sourceRadix < 1 || sourceRadix > 36 || targetRadix < 1 || targetRadix > 36;
        return b;
    }

    public void computeDecimalVariables() {
        Converter converter = new Converter();
        switch (sourceRadix) {
            case 10:
                decimalNumber = Integer.parseInt(stringSourceNumber);
                if (isNumberFractional) decimalFractionString = stringSourceFraction;
                break;
            case 1:
                decimalNumber = converter.fromOneToDecimal(stringSourceNumber);
                break;
            default:
                decimalNumber = converter.fromSourceToDecimal(stringSourceNumber, sourceRadix);
                if (isNumberFractional) {
                    decimalFractionString = converter.fromSourceToDecimalFraction(stringSourceFraction, sourceRadix, alphabet);
                }
                break;
        }
    }

    public void computeTargetVariables() {
        Converter converter = new Converter();
        switch (targetRadix) {
            case 10:
                targetNumber = decimalNumber.toString();
                if (isNumberFractional) targetFraction = decimalFractionString;
                break;
            case 1:
                targetNumber = converter.fromDecimalToOne(decimalNumber);
                break;
            default:
                targetNumber = converter.fromDecimalToTargetNumber(decimalNumber, targetRadix);
                if (isNumberFractional)
                    targetFraction = converter.fromDecimalToTargetFraction(decimalFractionString, targetRadix, alphabet);
                break;
        }
    }
}

class Converter {
    public Integer fromSourceToDecimal(String number, Integer radix) {
        return Integer.parseInt(number, radix);
    }

    public String fromSourceToDecimalFraction(String fraction, Integer radix, ArrayList<Character> alphabet) {
        Double sum = 0d;
        String result = "";
        char[] work = fraction.toCharArray();
        int j = 1;
        for (int i = 0; i < fraction.length(); i++) {
            int chislitel = alphabet.indexOf(work[i]);
            sum += chislitel / Math.pow(radix, j);
            j++;
        }
        result = sum.toString().split("\\.")[1];

        // The code below is a dirty hack to improve accuracy. Can be rewritten on BigDecimal.
        if (result.length() < 10) {
            result += "0000000000";
        }
        return result.substring(0, 10);
    }

    public String fromDecimalToTargetNumber(Integer numb, Integer radix) {
        return Integer.toString(numb, radix);
    }

    public String fromDecimalToTargetFraction(String fraction, Integer radix, ArrayList<Character> alphabet) {
        String workFraction = "0." + fraction;
        double decimalFraction = Double.parseDouble(workFraction);
        String result = "";

        for (int i = 0; i < 5; i++) {
            decimalFraction *= radix;
            int index = takeIndex(decimalFraction);
            result += alphabet.get(index);
            decimalFraction = takeFraction(decimalFraction);
        }
        return result;
    }

    private Integer takeIndex(double number) {
        return (int) number;
    }

    private double takeFraction(double number) {
        String doubleAsString = String.valueOf(number);
        doubleAsString = doubleAsString.split("\\.")[1];
        return Double.parseDouble("0." + doubleAsString);
    }

    public Integer fromOneToDecimal(String num) {
        return num.length();
    }

    public String fromDecimalToOne(Integer num) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < num; i++) {
            sb.append(1);
        }
        return sb.toString();
    }
}