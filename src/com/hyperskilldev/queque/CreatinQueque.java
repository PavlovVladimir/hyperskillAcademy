package com.hyperskilldev.queque;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class CreatinQueque {
    public static void main(String[] args) {

//        Deque<Integer> queue = new ArrayDeque<>();
//        queue.push(2);
//        queue.push(0);
//        queue.push(1);
//        queue.push(7);
//
//
//        System.out.println(queue);

        Deque<Integer> queue = new ArrayDeque<>(Arrays.asList(1,2,3,4));
        queue.offer(5);
        queue.poll();
        queue.poll();
        System.out.println(queue);
    }
}
