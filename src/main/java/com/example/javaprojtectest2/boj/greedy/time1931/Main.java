package com.example.javaprojtectest2.boj.greedy.time1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        List<int[]> times = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            times.add(new int[]{start, end});
        }

        times.sort((o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0]; //시작과 종료가 같은 경우가 있기 때문에!! ex (1,1) (4,4) (3,4) -> 2개만 선택 but 3개다 선택 가능함
            }
            return o1[1] - o2[1];
        });
        int nowEnd = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int[] ints = times.get(i);
            int start = ints[0];
            int end = ints[1];

            if (nowEnd <= start) {
                nowEnd = end;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
