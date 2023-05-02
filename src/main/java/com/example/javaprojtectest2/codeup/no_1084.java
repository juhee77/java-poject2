package com.example.javaprojtectest2.codeup;

import java.io.*;
import java.util.StringTokenizer;

public class no_1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int red = Integer.parseInt(st.nextToken());
        int green = Integer.parseInt(st.nextToken());
        int blue = Integer.parseInt(st.nextToken());

        for (int i = 0; i < red; i++) {
            for (int j = 0; j < green; j++) {
                for (int k = 0; k < blue; k++) {
                    bw.write(i + " " + j + " " + k + "\n");
                }
            }
        }
        bw.write((red * green * blue) + "\n");
        bw.flush();
    }
}
