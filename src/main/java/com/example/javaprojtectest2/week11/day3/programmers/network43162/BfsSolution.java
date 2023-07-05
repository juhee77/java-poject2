package com.example.javaprojtectest2.week11.day3.programmers.network43162;

import java.util.LinkedList;
import java.util.Queue;

public class BfsSolution {

    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                network(i, n, computers, visited);
                answer++;
            }
        }

        return answer;
    }

    private void network(int start, int n, int[][] computers, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while (!q.isEmpty()) {
            int next = q.poll();

            for (int j = 0; j < n; j++) {
                if (computers[next][j] == 1 && !visited[j]) { //연결된 노드가 있고 방문하지 않았음
                    visited[j] = true;
                    q.add(j);
                }
            }
        }
    }
}
