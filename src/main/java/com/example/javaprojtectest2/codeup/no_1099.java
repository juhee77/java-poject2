package com.example.javaprojtectest2.codeup;


import java.io.*;
import java.util.StringTokenizer;

public class no_1099 {
    private static final int SIZE = 10;

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


        int mvX = 1, mvY = 1;
        while (true) {
            if(map[mvX][mvY]==2){
                map[mvX][mvY] = 9;
                break;
            }

            map[mvX][mvY] = 9;
            if (mvY + 1 < SIZE && map[mvX][mvY + 1] != 1) {
                mvY++;
            } else if (mvX + 1 < SIZE && map[mvX + 1][mvY] != 1) {
                mvX++;
            } else {
                break;// 갈 수 있는 길이 없음
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
