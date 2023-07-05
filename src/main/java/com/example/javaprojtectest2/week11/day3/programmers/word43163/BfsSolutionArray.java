package com.example.javaprojtectest2.week11.day3.programmers.word43163;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BfsSolutionArray {

    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        // words 내에 target 이 존재하지 않으면 바로 반환
        if (!Arrays.asList(words).contains(target)) {
            return answer;
        }

        boolean[] visited = new boolean[words.length];
        int[] distance = new int[words.length];

        // begin 에서 일단 도달할 수 있는 words 내의 단어를 Queue 에 enqueue
        Queue<Integer> toVisit = new LinkedList<>();
        for (int i1 = 0; i1 < words.length; i1++) {
            if (!visited[i1] && similar(begin, words[i1])) {
                toVisit.offer(i1);
                visited[i1] = true;
                distance[i1] = 1;
            }
        }

        // BFS 진행
        while (!toVisit.isEmpty()) {
            int nextIdx = toVisit.poll();
            String nextWord = words[nextIdx];
            if (nextWord.equals(target)) {
                answer = distance[nextIdx];
                break;
            }

            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && similar(nextWord, words[i])) {
                    toVisit.offer(i);
                    visited[i] = true;
                    distance[i] = distance[nextIdx]+1;
                }
            }
        }

        return answer;
    }

    // 인접 판단 메소드: 두 단어가 한글자 제외 동일한지
    private boolean similar(String word, String target) {
        // String.charAt(i)
        int k = 0;  // 몇글자 일치하는지 저장
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == target.charAt(i)) {
                k++;
            }
        }
        return k == word.length() - 1;
    }
}
