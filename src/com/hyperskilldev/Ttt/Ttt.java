package com.hyperskilldev.Ttt;

import java.util.Scanner;

public class Ttt {
    private static boolean xWin = false;
    private static boolean oWin = false;
    private static boolean possible = true;
    private static boolean isGameFinished = false;
    private static boolean isDraw = false;
    private static String commandString="         ";
    private static String str1;
    private static String str2;
    private static String str3;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
 //       Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter cells: ");
//        commandString = scanner.nextLine().toUpperCase();

        str1 = commandString.substring(0,3);
        str2 = commandString.substring(3,6);
        str3 = commandString.substring(6,9);
        char[] c3 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        char[] c1 = str3.toCharArray();
        char whoGoes = 'X';
        char xGoes = 'X';
        char oGoes = 'O';

        printField();

        while (!isGameFinished&&!xWin&&!oWin&&!isDraw){
            System.out.print("Enter the coordinates: ");
            String x = scanner.next();
            String y = scanner.next();
            int xCoordinate;
            int yCoordinate;
            try {
                xCoordinate = (int) Integer.parseInt(x);
            }
            catch (NumberFormatException e)
            {
                System.out.println("You should enter numbers!");
                continue;
            }
            try {
                yCoordinate = (int) Integer.parseInt(y);
            }
            catch (NumberFormatException e)
            {
                System.out.println("You should enter numbers!");
                continue;
            }

            if (xCoordinate<1 || xCoordinate>3 || yCoordinate<1 || yCoordinate>3){
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            }

            switch (yCoordinate){
                case 1: if (xCoordinate==1 && c1[0]!='X' && c1[0]!='O'){
                        c1 [0] = whoGoes;
                        str3 = new String(c1);
                    if (whoGoes==xGoes){whoGoes=oGoes;}else{whoGoes=xGoes;}
                        printField();

                    } else if (xCoordinate==2 && c1[1]!='X'&& c1[1]!='O'){
                        c1 [1] = whoGoes;
                        str3 = new String(c1);
                    if (whoGoes==xGoes){whoGoes=oGoes;}else{whoGoes=xGoes;}
                        printField();

                    } else if (xCoordinate==3 && c1[2]!='X'&& c1[2]!='O'){
                        c1 [2] = whoGoes;
                        str3 = new String(c1);
                        if (whoGoes==xGoes){whoGoes=oGoes;}else{whoGoes=xGoes;}
                        printField();

                    } else if (c1[0]=='X' || c1[1]=='X' || c1[2]=='X' ||
                               c1[0]=='O' || c1[1]=='O' || c1[2]=='O' ){
                        System.out.println("This cell is occupied! Choose another one!");
//                        break;
                    }
                    break;
                case 2: if (xCoordinate==1 && c2[0]!='X'&& c2[0]!='O'){
                        c2 [0] = whoGoes;
                        str2 = new String(c2);
                    if (whoGoes==xGoes){whoGoes=oGoes;}else{whoGoes=xGoes;}
                        printField();
                    } else if (xCoordinate==2 && c2[1]!='X'&& c2[1]!='O'){
                        c2 [1] = whoGoes;
                        str2 = new String(c2);
                    if (whoGoes==xGoes){whoGoes=oGoes;}else{whoGoes=xGoes;}
                        printField();
                    } else if (xCoordinate==3 && c2[2]!='X'&& c2[2]!='O'){
                        c2 [2] = whoGoes;
                        str2 = new String(c2);
                    if (whoGoes==xGoes){whoGoes=oGoes;}else{whoGoes=xGoes;}
                        printField();
                    } else if (c2[0]=='X' || c2[1]=='X' || c2[2]=='X'||
                        c2[0]=='O' || c2[1]=='O' || c2[2]=='O'){
                        System.out.println("This cell is occupied! Choose another one!");
//                        break;
                    }
                    break;
                case 3: if (xCoordinate==1 && c3[0]!='X'&& c3[0]!='O'){
                    c3 [0] = whoGoes;
                    str1 = new String(c3);
                    if (whoGoes==xGoes){whoGoes=oGoes;}else{whoGoes=xGoes;}
                    printField();
                } else if (xCoordinate==2 && c3[1]!='X'&& c3[1]!='O'){
                    c3 [1] = whoGoes;
                    str1 = new String(c3);
                    if (whoGoes==xGoes){whoGoes=oGoes;}else{whoGoes=xGoes;}
                    printField();
                } else if (xCoordinate==3 && c3[2]!='X'&& c3[2]!='O'){
                    c3 [2] = whoGoes;
                    str1 = new String(c3);
                    if (whoGoes==xGoes){whoGoes=oGoes;}else{whoGoes=xGoes;}
                    printField();
                } else if (c3[0]=='X' || c3[1]=='X' || c3[2]=='X' ||
                        c3[0]=='O' || c3[1]=='O' || c3[2]=='O'){
                    System.out.println("This cell is occupied! Choose another one!");
 //                   break;
                }
                    break;

            }
            checkTheState();

        }
        printState();

    }

    public static void checkTheState (){
        String strV1 = str1.substring(0,1)+ str2.substring(0,1) + str3.substring(0,1);
        String strV2 = str1.substring(1,2)+ str2.substring(1,2) + str3.substring(1,2);
        String strV3 = str1.substring(2,3)+ str2.substring(2,3) + str3.substring(2,3);

        String strDiag1 = str1.substring(0,1)+ str2.substring(1,2) + str3.substring(2,3);
        String strDiag2 = str3.substring(0,1) + str2.substring(1,2) + str1.substring(2,3);

        if (str1.equalsIgnoreCase("xxx") || str2.equalsIgnoreCase("xxx") || str3.equalsIgnoreCase("xxx") ||
                strV1.equalsIgnoreCase("xxx") || strV2.equalsIgnoreCase("xxx") || strV3.equalsIgnoreCase("xxx") ||
                strDiag1.equalsIgnoreCase("xxx") || strDiag2.equalsIgnoreCase("xxx")){
            xWin = true;
        }

        if (str1.equalsIgnoreCase("ooo") || str2.equalsIgnoreCase("ooo") || str3.equalsIgnoreCase("ooo") ||
                strV1.equalsIgnoreCase("ooo") || strV2.equalsIgnoreCase("ooo") || strV3.equalsIgnoreCase("ooo") ||
                strDiag1.equalsIgnoreCase("ooo") || strDiag2.equalsIgnoreCase("ooo")){
            oWin = true;
        }

        String xStr = str1 + str2 + str3;
        String oStr = str1 + str2 + str3;
        int containX = xStr.length()-xStr.replaceAll("X","").length();
        int containO = oStr.length()-oStr.replaceAll("O","").length();



        if (containX-containO>=2 || containO-containX>=2){
            possible = false;
        }
        if (xWin&&oWin){
            possible=false;
        }


        if (containO+containX==9){
            isGameFinished = true;
        } else {
            isGameFinished = false;
        }


        if (isGameFinished&&!xWin&&!oWin){
            isDraw = true;
        }
    }
    public static void printField () {
        System.out.println("---------");
        System.out.println("| "+str1.substring(0,1)+" "+str1.substring(1,2)+" "+str1.substring(2,3)+" |");
        System.out.println("| "+str2.substring(0,1)+" "+str2.substring(1,2)+" "+str2.substring(2,3)+" |");
        System.out.println("| "+str3.substring(0,1)+" "+str3.substring(1,2)+" "+str3.substring(2,3)+" |");
        System.out.print("---------");
        System.out.println();
    }

    public static void printState () {
        if (!possible){
            System.out.println("Impossible");
        } else if (!isGameFinished&&!xWin&&!oWin){
            System.out.println("Game not finished");
        } else if (xWin){
            System.out.println("X wins");
        } else if (oWin){
            System.out.println("O wins");
        } else if (isDraw){
            System.out.println("Draw");
        }
    }


}