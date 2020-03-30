package com.hyperskilldev.ProcesingStrings;

import java.util.Scanner;

public class ParseUrl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String url = "https://target.com/index.html?port=8080&cookie=&host=localhost";
//        String url = scanner.nextLine();
//        String parameters = url.split("\\?")[1];
//        System.out.println(parameters);
        url = url.replaceAll("^\\S+\\?","");
//        System.out.println(url);
        String[] urlArray = url.split("&");
        String password = "";
        boolean isHasPassword = false;

        for (String str :
                urlArray) {

            if(str.substring(0,4).equals("pass")){
                password = str.replaceAll("^\\S+\\=","");
                isHasPassword = true;
            }

            if (str.substring(str.length()-1).equals("=")){
                str = str.replace("=", "=not found");
            }

            str = str.replaceAll("=", " : ");

            System.out.println(str);
         //  System.out.println(str.substring(str.length()-1));
        }
        if (isHasPassword){
        System.out.println("password : " + password);
        }
    }
}
