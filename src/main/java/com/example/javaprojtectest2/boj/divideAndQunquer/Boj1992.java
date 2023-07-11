package com.example.javaprojtectest2.boj.divideAndQunquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1992 {
    private char[][] image;
    private StringBuilder quadTreeBuilder;

    public static void main(String[] args) throws IOException {
        new Boj1992().solution();
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        image = new char[n][];

        for (int i = 0; i < n; i++) {
            image[i] = br.readLine().toCharArray();
        }
        quadTreeBuilder = new StringBuilder();
        compressQuad(n, 0, 0);
        System.out.println(quadTreeBuilder);
    }

    private void compressQuad(
            //n : 정사각형 한변의 길이
            int n,
            //x: 정사각형의 시작 x index
            int x,
            //y: 정사각형의 시작 y index
            int y) {

        //현재 사각형이 모두 같은 색으로 칠해져 있다면
        if (isSuccess(n, x, y)) {
            quadTreeBuilder.append(image[x][y]);
        } else {
            //4등분하여 재귀호출한다.
            quadTreeBuilder.append("(");

            int half = n / 2;
            compressQuad(half, x, y); //왼쪽 상단
            compressQuad(half, x, y + half);//오른쪽 상단
            compressQuad(half, x + half, y); //왼쪽 하단
            compressQuad(half, x + half, y + half); //오른쪽 하단.

            quadTreeBuilder.append(")");
        }
    }

    //조건을 만족하는지 확인하는 메소드
    private boolean isSuccess(int n, int x, int y) {
        char init = image[x][y];
        for (int i = x; i < x + n; i++) {
            for (int j = y; j < y + n; j++) {
                if (image[i][j] != init) return false;
            }
        }
        return true;
    }
}
