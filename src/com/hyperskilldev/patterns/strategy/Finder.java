package com.hyperskilldev.patterns.strategy;

import java.util.Scanner;

class Finder {

    private FindingStrategy strategy;

    public Finder(FindingStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * It performs the search algorithm according to the given strategy
     */
    public int find(int[] numbers) {
        return this.strategy.getResult(numbers);
    }
}

interface FindingStrategy {

    /**
     * Returns search result
     */
    int getResult(int[] numbers);

}

class MaxFindingStrategy implements FindingStrategy {

    public int getResult(int[] numbers) {
        int result = Integer.MIN_VALUE;

        if (0 == numbers.length) {
            return result;
        }

        if (1 == numbers.length) {
            return numbers[0];
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        return result;
    }
}

class MinFindingStrategy implements FindingStrategy {

    public int getResult(int[] numbers) {
        int result = Integer.MAX_VALUE;

        if (0 == numbers.length) {
            return result;
        }

        if (1 == numbers.length) {
            return numbers[0];
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < result) {
                result = numbers[i];
            }
        }
        return result;
    }
}

//class MinFindingStrategy implements FindingStrategy {
//
//    public int getResult(int[] numbers) {
//        return Arrays.stream(numbers)
//                .min()
//                .orElse(Integer.MAX_VALUE);
//    }
//}


/* Do not change code below */
class Main {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final String[] elements = scanner.nextLine().split("\\s+");
        int[] numbers = null;

        if (!elements[0].equals("EMPTY")) {
            numbers = new int[elements.length];
            for (int i = 0; i < elements.length; i++) {
                numbers[i] = Integer.parseInt(elements[i]);
            }
        } else {
            numbers = new int[0];
        }

        final String type = scanner.nextLine();

        Finder finder = null;

        switch (type) {
            case "MIN":
                finder = new Finder(new MinFindingStrategy());
                break;
            case "MAX":
                finder = new Finder(new MaxFindingStrategy());
                break;
            default:
                break;
        }

        if (finder == null) {
            throw new RuntimeException(
                    "Unknown strategy type passed. Please, write to the author of the problem.");
        }

        System.out.println(finder.find(numbers));
    }
}