package com.example.javaprojtectest2.Programmers;

import java.util.Arrays;
import java.util.PriorityQueue;

public class 명예의전당_138477 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < score.length; i++) {
            if (pq.size() < k) pq.add(score[i]);
            else {
                if (pq.peek() < score[i]) {
                    pq.poll();
                    pq.add(score[i]);
                }
            }

            answer[i] = pq.peek();
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 명예의전당_138477().solution(3, new int[]{10, 100, 20, 150, 1, 100, 200})));
    }
}
