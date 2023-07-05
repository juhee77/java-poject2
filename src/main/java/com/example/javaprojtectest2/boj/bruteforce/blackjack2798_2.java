package com.example.javaprojtectest2.boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class blackjack2798_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int nearM = 0;
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        int sum;
        for (int i = 0; i < n; i++) {
            sum = arr[i];
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                for (int k = j + 1; k < n; k++) {
                    sum += arr[k];
                    if (sum <= m && Math.abs(sum - m) < Math.abs(m - nearM)) {
                        nearM = sum;
                    }
                    sum -= arr[k];
                }
                sum -= arr[j];
            }
        }
        System.out.println(nearM);
    }
}
