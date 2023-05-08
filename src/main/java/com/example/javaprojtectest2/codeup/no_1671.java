package com.example.javaprojtectest2.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_1671 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int aNum = Integer.parseInt(st.nextToken());
        int bNum = Integer.parseInt(st.nextToken());
        switch (getResult(aNum, bNum)) {
            case 1:
                System.out.println("win");
                break;
            case -1:
                System.out.println("lose");
                break;
            default:
                System.out.println("tie");
        }
    }

    private static int getResult(int aNum, int bNum) {
        if (aNum == bNum) {
            return 0;
        } else if ((aNum + 1) % 3 == bNum % 3) {
            return 1;
        } else {
            return -1;
        }
    }
}
