

package com.example.javaprojtectest2.codeup;

import java.io.IOException;
import java.util.Scanner;

public class no_1054 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean flag1 = sc.nextInt() == 1;
        boolean flag2 = sc.nextInt() == 1;

        System.out.println((flag1 && flag2) ? 1 : 0);
    }
}
