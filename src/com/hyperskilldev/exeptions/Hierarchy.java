package com.hyperskilldev.exeptions;

import java.util.Arrays;
import java.util.Scanner;

/**
 * The base class for all exceptions is java.lang.Throwable. This class provides a set of common methods for all
 * exceptions:
 *
 *     String getMessage() returns the detailed string message of this exception object;
 *     Throwable getCause() returns the cause of this exception or null if the cause is nonexistent or unknown;
 *     printStackTrace() prints the stack trace on the standard error stream.
 *
 * We will return to the methods and constructors of this class in the following topics.
 *
 * The Throwable class has two direct subclasses: java.lang.Error and java.lang.Exception.
 *
 *     subclasses of the Error class represents low-level exceptions in JVM, for example: OutOfMemoryError,
 *     StackOverFlowError;
 *     subclasses of the Exception class deal with exceptional events inside applications, such as: RuntimeException,
 *     IOException;
 *     the RuntimeException class is rather a special subclass of Exception. It represents so-called unchecked
 *     exceptions, including: ArithmeticException, NumberFormatException, NullPointerException.
 *
 * While developing an application, you normally will process objects of the Exception class and its subclasses.
 * We won't discuss Error and its subclasses anymore.
 *
 * The four basic classes of exceptions (Throwable, Exception, RuntimeException and Error) are located in the
 * java.lang package. They do not need to be imported. Yet their subclasses might be placed in different packages.
 */
public class Hierarchy {
    public static void methodCatchingSomeExceptions() {
        try {
            methodThrowingExceptions();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (NumberFormatException e){
            System.out.println("NumberFormatException ");
        }
    }

    /* Do not change code below */
    public static void methodThrowingExceptions() {
        if (array == null) {
            return;
        }
        int[] integers = Arrays.stream(array.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Object someValue = integers[integers[0]];
        if (integers[0] + integers[1] == integers[2]){
            integers = null;
        }
        int sum = 0;
        for (int i : integers){
            sum += i;
        }
        int meanValue = integers.length / sum;
        if (integers[2] == integers[3]){
            String string = (String) someValue;
            System.out.print("Random value is " + string);
        }
        System.out.print("Mean is " + meanValue);
    }

    private static String array = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        array = scanner.nextLine();
        try {
            methodCatchingSomeExceptions();
        } catch (Exception e) {
            System.out.println("Caught: " + e.getClass().getName());
        }
    }



}
