package com.example.javaprojtectest2.week11.day3.programmers.word43163;

import java.util.LinkedList;
import java.util.Queue;

public class BfsSolution {

    private boolean[] visited;
    private String[] words;
    private Queue<Integer> queue = new LinkedList<>();

    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        this.words = words;

        addAbleWords(begin); //시작단어에 의해 처음 변환될 수 있는 단어들
        return bfs(target);
    }

    private int bfs(String target) {
        int depth = 0;
        while (!queue.isEmpty()) {
            depth++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String now = words[queue.poll()];
                if (now.equals(target)) return depth; //찾았으면
                addAbleWords(now); //다음 변환될 수 있는 단어들
            }
        }
        return depth;
    }

    private void addAbleWords(String now) { //단어 사전중 한글자만 바꿔서 나올 수 있는 단어들
        for (int i = 0; i < words.length; i++) {
            if (!visited[i] && checkAble(now, words[i])) {
                queue.add(i);
                visited[i] = true;
            }
        }
    }

    private boolean checkAble(String now, String word) {
        if (now.length() != word.length()) {
            return false;
        }

        int diffCnt = 0;
        for (int i = 0; i < now.length() && diffCnt < 2; i++) {
            if (now.charAt(i) != word.charAt(i)) {
                diffCnt++;
            }
        }
        return diffCnt == 1;
    }
}
