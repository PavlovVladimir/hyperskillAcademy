package com.hyperskilldev.numericalSystems;

import java.util.Scanner;

public class ConvertingFractions {

    public static void main(String[] args) {
        Data data = new Data();
        data.getDataFromCLI();
        data.computeDecimalVariables();
        data.computeTargetVariables();
        printNumber(data.targetNumber, data.targetFraction);
    }

    public static void printNumber(Integer number, Integer fraction) {
        if (fraction == null) {
            System.out.println(number);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(number).append(".").append(fraction);
            System.out.println(sb);
        }
    }
}

class Converter {
    public Integer convertFromSourceToDecimal(Integer num, Integer radix) {
        return 0;
    }

    public Integer convertFromSourcetoDecimalFraction(Integer fraction, Integer radix) {
        return 0;
    }

    public Integer convertFromDecimalToTargetNumber(Integer numb, Integer radix) {
        return 0;
    }

    public Integer convertFromDecimalToTargetFractional(Integer fraction, Integer radix) {
        return 0;
    }

    public Integer convertFromOneToDecimal(Integer num) {
        String result = num.toString();
        return result.length();
    }

    public Integer convertFromDecimalToOne(Integer num) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < num; i++) {
            sb.append(1);
        }
        return Integer.parseInt(sb.toString());
    }
}

class Data {
    String stringRadix;
    String stringNumber;
    String stringTargetRadix;
    String stringFraction;

    boolean isNumberFractional = false;

    Integer sourceFraction;
    Integer sourceNumber;
    Integer sourceRadix;

    Integer decimalNumber;
    Integer decimalFraction;

    Integer targetRadix;
    Integer targetNumber;
    Integer targetFraction;

    public void getDataFromCLI() {
        Scanner scanner = new Scanner(System.in);

        stringRadix = scanner.nextLine();
        stringNumber = scanner.nextLine();
        stringTargetRadix = scanner.nextLine();

        if (stringNumber.contains(".")) {
            String number = stringNumber.split(".")[0];
            stringFraction = stringNumber.split(".")[1];
            stringNumber = number;
            isNumberFractional = true;
        }

        computeVariables();
    }

    private void computeVariables() {
        try {
            sourceRadix = Integer.parseInt(stringRadix);
            targetRadix = Integer.parseInt(stringTargetRadix);
            if (isNumberFractional) {
                sourceNumber = Integer.parseInt(stringNumber);
                sourceFraction = Integer.parseInt(stringFraction);
            } else {
                sourceNumber = Integer.parseInt(stringNumber);
            }

        } catch (Exception e) {
            System.out.println("Your input was wrong: " + e);
        }
    }

    public void computeDecimalVariables() {
        Converter converter = new Converter();
        switch (sourceRadix) {
            case 10:
                decimalNumber = sourceNumber;
                if (isNumberFractional) decimalFraction = sourceFraction;
                break;
            case 1:
                decimalNumber = converter.convertFromOneToDecimal(sourceNumber);
                break;
            default:
                decimalNumber = converter.convertFromSourceToDecimal(sourceNumber, sourceRadix);
                if (isNumberFractional) {
                    decimalFraction = converter.convertFromSourcetoDecimalFraction(sourceFraction, sourceRadix);
                }
                break;
        }
    }

    public void computeTargetVariables() {
        Converter converter = new Converter();
        switch (targetRadix) {
            case 10:
                targetNumber = decimalNumber;
                if (isNumberFractional) targetFraction = decimalFraction;
                break;
            case 1:
                targetNumber = converter.convertFromDecimalToOne(decimalNumber);
                break;
            default:
                targetNumber = converter.convertFromDecimalToTargetNumber(decimalNumber, targetRadix);
                if (isNumberFractional)
                    targetFraction = converter.convertFromDecimalToTargetFractional(decimalFraction, targetRadix);
                break;
        }
    }
}