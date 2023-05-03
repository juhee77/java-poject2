package com.example.javaprojtectest2.codeup;

import java.io.*;
import java.util.StringTokenizer;

public class no_1098 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int rowSize = Integer.parseInt(st.nextToken());
        int colSize = Integer.parseInt(st.nextToken());
        int[][] map = new int[rowSize][colSize];

        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            int len = Integer.parseInt(st.nextToken());
            int dir = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;

            if (dir == 1) {//세로
                for (int j = 0; j < len; j++) {
                    if (x + j<rowSize) map[x + j][y] = 1;
                }
            } else {//가로
                for (int j = 0; j < len; j++) {
                    if (y + j < colSize) map[x][y + j] = 1;
                }

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
