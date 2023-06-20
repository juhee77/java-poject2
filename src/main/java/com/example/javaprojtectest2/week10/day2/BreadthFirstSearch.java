package com.example.javaprojtectest2.week10.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {
    /*
       입력 예제 :
       7
       1 2 1 3 2 4 2 5 4 6 5 6 6 7 3 7
       * */
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxNodes = Integer.parseInt(reader.readLine());
        // 인접 정보 저장용
        int[][] adjMap = new int[maxNodes + 1][maxNodes + 1];

        String[] edges = reader.readLine().split(" ");
        for(int i = 0; i < edges.length / 2; i++) {
            int leftNode = Integer.parseInt(edges[i * 2]);
            int rightNode = Integer.parseInt(edges[i * 2 + 1]);
            adjMap[leftNode][rightNode] = 1;
            adjMap[rightNode][leftNode] = 1;
        }

        // BFS
        Queue<Integer> toVisit = new LinkedList<>();

        List<Integer> visitedOrder = new ArrayList<>();
        boolean[] visited = new boolean[maxNodes + 1];

        int next = 1;
        toVisit.offer(next);

        while (!toVisit.isEmpty()) {
            next = toVisit.poll();

            if (visited[next]) continue;

            visited[next] = true;
            visitedOrder.add(next);


            for(int i = 0; i < maxNodes + 1; i++) {
                // dajMap[next]가 담고 있는 배열은 idx 번째가 1인 경우 idx에 연결되어있다는 의미
                if(adjMap[next][i] == 1 && ! visited[i])
                    toVisit.offer(i);
            }
        }
        System.out.println(visitedOrder);
    }

    public static void main(String[] args) throws IOException {
        new BreadthFirstSearch().solution();
    }
}
