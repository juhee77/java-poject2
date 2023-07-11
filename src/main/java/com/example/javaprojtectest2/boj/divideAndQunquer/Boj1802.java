package com.example.javaprojtectest2.boj.divideAndQunquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1802 {
    public static void main(String[] args) throws IOException {
        new Boj1802().solution();
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());
        while (tests-- > 0) {
            if (foldable(br.readLine())) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private boolean foldable(String paper) {
        if (paper.length() > 1) {
            int half = paper.length() / 2;

            //왼쪽 종이와 오른쪽 종이가 가능한 경우인지 확인한다.
            if (!foldable(paper.substring(0, half))) return false; //왼쪽
            if (!foldable(paper.substring(half + 1))) return false; //오른쪽

            //접혔던 작은 부분들이 가능한 경우라면 현재 페이지에서 서로 반대 방향이 되는지 확인한다.
            for (int i = 1; i < half + 1; i++) {
                if (paper.charAt(half - i) == paper.charAt(half + i)) {
                    return false; //둘이 같으면 안된다. (서로 반대 방향이여야 한다)
                }
            }
        }

        //반으로 접은 경우이므로 1페이지인 경우 확인하지 않아도 된다.
        return true;
    }
}
