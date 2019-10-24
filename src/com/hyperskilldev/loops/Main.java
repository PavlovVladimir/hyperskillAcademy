package com.hyperskilldev.loops;

import java.util.Scanner;

/**
 * for (initialization; condition; modification) {
 *             // do something
 *         }
 *
 *         It is possible to declare a variable outside the loop:
 *
 * int i = 10;
 * for (; i > 0; i--) {
 *     System.out.print(i + " ");
 * }
 *
 * Moreover, it is also possible to write an infinite loop without these parts at all:
 *
 * for (;;) {
 *     // do something
 * }
 *
 * while (true) {
 *     // body: do something indefinitely
 * }
 *
 * do {
 *     // body: do something
 * } while (condition);
 * The following example demonstrates a loop that includes one break.
 *
 * int i = 10;
 * while (true) { // the condition to continue the loop
 *     if (i == 0) { // the condition to perform break that stops this loop
 *         break;
 *     }
 *     i--;
 * }
 *
 * In the code above, the condition to continue the loop is always true,
 * but it will be successfully stopped when the variable i becomes 0 through
 * the use of break inside the conditional statement.
 *
 * System.out.println(broken ? "BROKEN" : "OK");
 *
 * FOR-EACH LOOP
 *
 * char[] characters = { 'a', 'b', 'c', 'a', 'b', 'c', 'a' };
 *
 * int counter = 0;
 * for (char ch : characters) {
 *     if (ch == 'a') {
 *         counter++;
 *     }
 * }
 *
 * System.out.println(counter); // it outputs "3"
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int result = (b - a) / n + 1;

        System.out.println(result);

    }
}
