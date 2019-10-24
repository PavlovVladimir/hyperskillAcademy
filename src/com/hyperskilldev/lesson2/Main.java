package com.hyperskilldev.lesson2;

import java.util.Scanner;

/**
 *
 NOT is a unary operator that reverses the boolean value. It is denoted as !.

 boolean f = false; // f is false
 boolean t = !f;    // t is true

 AND is a binary operator that returns true if both operands are true, otherwise, it is false. It is denoted as &&.

 boolean b1 = false && false; // false
 boolean b2 = false && true;  // false
 boolean b3 = true && false;  // false
 boolean b4 = true && true;   // true

 OR is a binary operator that returns true if at least one operand is true, otherwise, it returns false. It is denoted as ||.

 boolean b1 = false || false; // false
 boolean b2 = false || true;  // true
 boolean b3 = true || false;  // true
 boolean b4 = true || true;   // true

 XOR (exclusive OR) is a binary operator that returns true if boolean operands have different values, otherwise, it is false.

 boolean b1 = false ^ false; // false
 boolean b2 = false ^ true;  // true
 boolean b3 = true ^ false;  // true
 boolean b4 = true ^ true;   // false

 The XOR operator is used less often than others. Just remember that Java has it. If you really need it, you can use it
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int reeses = scanner.nextInt();
 //       boolean sunday = scanner.nextBoolean();
        int army = reeses;
        String result = null;
//        boolean party = reeses>=10 && reeses<=20 && !sunday || reeses>=15 && reeses<=25 && sunday;
//        System.out.println(party);
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//
//        boolean isBetweenCandD = (a>=b&&a<=c)||(a>=c&&a<=b);
//
//        boolean oneDigitIsPlus = (a>0 && b<=0 && c<=0) || (a<=0 && b>0 && c<=0) || (a<=0 && b<=0 && c>0);
//
//        System.out.println(isBetweenCandD);
//        System.out.println(oneDigitIsPlus);
if (army<1){
    result = "no army";
}else if (army <=4){
    result = "few";
}else if (army<=9) {
    result = "several";
}else if (army <=19){
    result = "pack";
}else if (army <=49){
    result = "lots";
}else if (army <=99){
    result = "horde";
}else if (army <=249){
    result = "throng";
}else if (army <=499){
    result = "swarm";
}else if (army <=999){
    result = "zounds";
}else {
    result = "legion";
}
        System.out.println(result);

    }
}
