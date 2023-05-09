package com.example.javaprojtectest2.codeup;

import java.io.*;
import java.util.StringTokenizer;

public class No1098Oop {
    int[][] map;

    public No1098Oop(int rowCount, int colCount) {
        this.map = new int[rowCount][colCount];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int rowSize = Integer.parseInt(st.nextToken());
        int colSize = Integer.parseInt(st.nextToken());
        No1098Oop no1098Oop = new No1098Oop(rowSize, colSize);


        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            int len = Integer.parseInt(st.nextToken());
            int dir = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            no1098Oop.setBeam(len, dir, x, y);
        }
        no1098Oop.printArr();
    }

    private void printArr() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int[] row : map) {
            for (int col : row) {
                bw.write(col + " ");
            }
            bw.write("\n");
        }
        bw.flush();
    }

    private void setBeam(int len, int dir, int x, int y) {
        if (dir == 1) {//세로
            for (int j = 0; j < len; j++) {
                if (x + j < map.length) map[x + j][y] = 1;
            }
        } else {//가로
            for (int j = 0; j < len; j++) {
                if (y + j < map[0].length) map[x][y + j] = 1;
            }

        }
    }
}
