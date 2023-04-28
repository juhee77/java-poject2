package com.example.javaprojtectest2.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_3011 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        System.out.println(bubbleSort(input()));
    }

    private static int[] input() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        return arr;
    }

    private static int bubbleSort(int[] arr) {
        boolean isSort = false;
        int ans;
        for (ans = 0; ans < arr.length && !isSort; ans++) {
            isSort = true;
            for (int j = 0; j < arr.length - 1 - ans; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapNum(arr, j);
                    isSort = false;
                }
            }
        }
        return ans - 1;
    }

    private static void swapNum(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }
}
