package com.hyperskilldev.queque;

import java.util.Scanner;
import java.util.Stack;

public class MaxElementOfStack {
    public static void main(String[] args) {


            Stack<Integer> mainStack = new Stack<Integer> ();

            Stack<Integer> maxStack = new Stack<Integer> ();
            Scanner scanner = new Scanner(System.in);
            int maxOfiterations = scanner.nextInt();
            Integer element=0;

            for (int i = 0; i <= maxOfiterations ; i++) {
                String command = scanner.nextLine();
                if (command.startsWith("pop")){
                    mainStack.pop();
                    maxStack.pop();
                }
                if (command.startsWith("max")){
                    System.out.println(maxStack.peek());
                }
                if (command.startsWith("push")){
                    element = Integer.parseInt(command.split(" ")[1]);
                    mainStack.push(element);

                    if (mainStack.size()==1){
                        maxStack.push(element);
                        continue;
                    }
                    if (element > maxStack.peek()) {
                        maxStack.push(element);
                        continue;
                    } else {
                        maxStack.push(maxStack.peek());
                        continue;
                    }
                }


            }
        }
    }
