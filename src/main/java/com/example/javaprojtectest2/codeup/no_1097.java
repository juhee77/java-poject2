package com.example.javaprojtectest2.codeup;

import java.io.*;
import java.util.StringTokenizer;

public class no_1097 {
    public static final int SIZE = 19;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;


        int[][] map = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int callOuts = Integer.parseInt(br.readLine());
        for (int i = 0; i < callOuts; i++) {
            st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken()) - 1;
            int col = Integer.parseInt(st.nextToken()) - 1;

            for (int j = 0; j < SIZE; j++) {
                map[row][j] = map[row][j] == 1 ? 0 : 1;
            }
            for (int j = 0; j < SIZE; j++) {
                map[j][col] = map[j][col] == 1 ? 0 : 1;
            }
        }

        for (int[] row : map) {
            for (int col : row) {
                bw.write(col + " ");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
