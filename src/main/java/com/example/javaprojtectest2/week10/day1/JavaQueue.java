package com.example.javaprojtectest2.week10.day1;

import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        //enqueue
        //오류 상황에서 add -> 예외 발생, offer -> null반환
        queue.add(2);
        queue.offer(2);

        //deque
        //empty 시에 remove -> 예외 발생, poll -> null을 반환
        System.out.println(queue.remove());
        System.out.println(queue.poll());

        //peek
        ///empty 시에 peek -> null 반환, element -> 예외 발생
        System.out.println(queue.peek());
        System.out.println(queue.element());
    }
}
