

package com.example.javaprojtectest2.codeup;

import java.io.IOException;
import java.util.Scanner;

public class no_1068 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println(getScore(sc.nextInt()));

    }

    private static char getScore(int num) {
        switch (num / 10) {
            case 9:
            case 10:
                return 'A';
            case 7:
            case 8:
                return 'B';
            case 4:
            case 5:
            case 6:
                return 'C';
            default:
                return 'D';

        }
    }
}
