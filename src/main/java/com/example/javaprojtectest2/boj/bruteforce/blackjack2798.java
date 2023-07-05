package com.example.javaprojtectest2.boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class blackjack2798 {
    private static int nearM = 0, m, n;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();

        dfs(0, 0, 0);
        System.out.println(nearM);
    }

    public static void dfs(int depth, int sum, int start) {
        if (depth == 3) {

            if (Math.abs(nearM - m) > Math.abs(m - sum) && sum<=m) {
                nearM = sum;
            }
            return;
        }
        for (int i = start; i < n; i++) {
            dfs(depth + 1, sum + arr[i], i + 1);
        }
    }
}
