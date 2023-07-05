package com.example.javaprojtectest2.week11.day3.programmers.word43163;

public class DfsSolution {

    private String target;
    private String[] words;
    private boolean[] visited;
    private int minDepth = Integer.MAX_VALUE;

    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        this.target = target;
        this.words = words;
        dfs(begin, 0);
        return (minDepth == Integer.MAX_VALUE) ? 0 : minDepth;
    }

    private void dfs(String now, int depth) {
        if (target.equals(now)) {
            minDepth = Math.min(minDepth, depth);
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (visited[i]) {
                continue;//이미 방문함
            }
            if (checkAble(now, words[i])) {
                visited[i] = true;
                dfs(words[i], depth + 1);
                visited[i] = false;
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
