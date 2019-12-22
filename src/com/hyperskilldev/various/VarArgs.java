package com.hyperskilldev.various;

/**
 * Varargs and other parameters
 *
 * If a method has more than one parameter, a vararg parameter must be the last parameter in the declaration of the method.
 *
 * Here is an incorrect example:
 *
 * public static void method(double... varags, int a) { do something  }
        *
        *The correct version of the method is:
        *
        *public static void method(int a,double...varags){  do something  }



 */
public class VarArgs {
    public static void main(String[] args) {
        method(null);
        // method(1);
        method(new double[]{});
        // method();
        method(new double[]{1.02, 1.03, 1.04});
        // method(1, 2, 3);
    }

    public static void method(double[] array) { /* do something */ }


}