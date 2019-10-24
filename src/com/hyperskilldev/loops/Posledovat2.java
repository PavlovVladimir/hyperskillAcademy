package com.hyperskilldev.loops;

import java.util.Scanner;

public class Posledovat2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isMore = true;
        boolean isLess = true;
        boolean breakeble = true;

        int input = scanner.nextInt();
        int posled = scanner.nextInt();

        while (posled!=0 && breakeble){
            input = scanner.nextInt();
            if (input==0){
                System.out.println("GeneralCcucleBreak");
                break;}
            if (input==posled){
                System.out.println("GeneralCircleContinue");
                continue;}
            System.out.println("GeneralCcucleInput");



            if (input>posled&&isMore){
                System.out.println("MoreCcucleInput");
                while (isMore){
                    System.out.println("MoreCcucleContinue");
                    isLess=false;
                    input = scanner.nextInt();
                    if (input==0){
                        System.out.println("MoreCcucleBreak");
                        breakeble=false;
                        break;
                    }
                    if (input<posled){
                        isMore=false;
                    } else {
                        posled=input;
                        continue;
                    }
                }

            }

            if (input<posled&&isLess){
                while (isLess){
                    isMore=false;
                    input = scanner.nextInt();
                    if (input==0){
                        breakeble=false;
                        break;
                    }
                    if (input>posled){
                        isLess=false;
                    } else {
                        posled=input;
                        continue;
                    }
                }

            }

        }

        if(isMore || isLess){
            System.out.println("true");
        } else {
            System.out.println("false");
        }



    }
}
