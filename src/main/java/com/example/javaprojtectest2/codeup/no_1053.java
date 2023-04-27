

package com.example.javaprojtectest2.codeup;

import java.io.IOException;
import java.util.Scanner;

public class no_1053 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = num == 1;

        System.out.println((!flag) ? 1 : 0);
    }
}
