package com.example.javaprojtectest2.codeup;

import java.io.*;
import java.util.StringTokenizer;

public class no_1096 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;


        int[][] map = new int[19][19];
        int callOuts = Integer.parseInt(br.readLine());
        for (int i = 0; i < callOuts; i++) {
            st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken())-1;
            int col = Integer.parseInt(st.nextToken())-1;

            map[row][col]=1;
        }

        for (int[] row : map) {
            for (int col : row) {
                bw.write(col+" ");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
