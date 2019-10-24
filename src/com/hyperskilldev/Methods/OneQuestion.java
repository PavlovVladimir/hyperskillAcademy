package com.hyperskilldev.Methods;

/**
 * Signatures
 *
 * The combination of the name of a method and its parameters is called the signature. It doesn't include:
 *
 *     the returning type
 *     modifiers
 *     names of parameters
 *
 *     The considered method
 *     public static int sum(int a, int b) {
 *     return a + b;
 * }
 * has the signature sum(int, int).
 *
 * Here are some examples of other signatures:
 *
 *     sum(double, double)
 *     min(long, long, long)
 *     getValue()
 */
public class OneQuestion {
    public static void main(String[] args) {
        char ch = 'q';
        String str = (String) String.valueOf(ch);
        if ("a".equalsIgnoreCase(str)||"e".equalsIgnoreCase(str)||
                "i".equalsIgnoreCase(str)||"o".equalsIgnoreCase(str)||
                "u".equalsIgnoreCase(str)){}
    }


 //   static public void method(String s) { /* Do something */ }
//   public void method(String s) { /* Do something */ }
   // public static void method(String s) { /* Do something */ }
  //  void public method(String s) { /* Do something */ }


}
