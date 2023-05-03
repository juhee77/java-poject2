package com.example.javaprojtectest2.codeup;

import java.io.*;

public class no_1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int callOuts = Integer.parseInt(br.readLine());
        String[] all = br.readLine().split(" ");

        for (int i = callOuts - 1; 0 <= i; i--) {
            bw.write(all[i] + " ");
        }

        bw.flush();

    }
}
