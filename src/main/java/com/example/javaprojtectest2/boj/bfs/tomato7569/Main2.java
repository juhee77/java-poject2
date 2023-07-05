package com.example.javaprojtectest2.boj.bfs.tomato7569;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main2 {
    private int[][][] box;
    private int row, col, height;
    private final int[] dirX = {0, 0, 0, 0, -1, 1};
    private final int[] dirY = {0, 0, -1, 1, 0, 0};
    private final int[] dirZ = {1, -1, 0, 0, 0, 0};

    public static void main(String[] args) throws IOException {
        System.out.println(new Main2().solution());
    }

    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        col = Integer.parseInt(st.nextToken());
        row = Integer.parseInt(st.nextToken());
        height = Integer.parseInt(st.nextToken());
        box = new int[height][row][col]; //z x y
        Queue<int[]> queue = new LinkedList<>();


        for (int i = 0; i < height; i++) {
            for (int p = 0; p < row; p++) {
                st = new StringTokenizer(br.readLine());
                for (int q = 0; q < col; q++) {
                    box[i][p][q] = Integer.parseInt(st.nextToken());
                    if (box[i][p][q] == 1) {
                        queue.add(new int[]{i, p, q, 0});
                    }
                }
            }
        }


        int day = 0;

        while (!queue.isEmpty()) {

            int[] poll = queue.poll();
            if (poll[3] != day) {
                day = poll[3];
            }

            for (int j = 0; j < 6; j++) {
                int mvZ = poll[0] + dirZ[j];
                int mvX = poll[1] + dirX[j];
                int mvY = poll[2] + dirY[j];

                if (mvX < 0 || mvY < 0 || mvZ < 0 || row <= mvX || col <= mvY || height <= mvZ) continue; //범위를넘어감
                if (box[mvZ][mvX][mvY] == 0) {
                    box[mvZ][mvX][mvY] = 1;
                    queue.add(new int[]{mvZ, mvX, mvY, poll[3] + 1});
                }
            }
        }

        //마지막 토마토 체크
        return isAllAged() ? day : -1;
    }

    private boolean isAllAged() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    if (box[i][j][k] == 0) return false;
                }
            }
        }
        return true;
    }
}
