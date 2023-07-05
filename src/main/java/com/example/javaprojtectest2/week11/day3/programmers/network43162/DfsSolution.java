package com.example.javaprojtectest2.week11.day3.programmers.network43162;

public class DfsSolution {

    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        for (int root = 0; root < n; root++) {
            if (!visited[root]) {
                visited[root] = true;
                network(root, n, computers, visited);
                answer++;
            }
        }

        return answer;
    }

    private void network(int parent, int n, int[][] computers, boolean[] visited) {
        for (int child = 0; child < n; child++) {
            if (computers[parent][child] == 1 && !visited[child]) {
                visited[child] = true;
                network(child, n, computers, visited);
            }
        }
    }
}
