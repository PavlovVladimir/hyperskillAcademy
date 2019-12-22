package com.hyperskilldev.various;

import java.util.Scanner;

public class NameAdding {


        public static String prepareFullName(String firstName, String lastName) {
            if ("".equals(firstName) || firstName==null){
                if (lastName.equals("")){
                    return "";
                }else { return lastName;}
            }

            if (lastName.equals("")){
                if (firstName.equals("")){
                    return "";
                }else {return firstName;}
            }
            return firstName+" "+ lastName;
        }

        /* Do not change code below */
        public static void main(String[] args) {
            final Scanner scanner = new Scanner(System.in);

            String firstName = scanner.nextLine();
            firstName = "null".equals(firstName) ? null : firstName;

            String lastName = scanner.nextLine();
            lastName = "null".equals(lastName) ? null : lastName;

            System.out.println(prepareFullName(firstName, lastName));
        }
    }

