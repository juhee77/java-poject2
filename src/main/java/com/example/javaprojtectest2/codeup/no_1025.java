package com.example.javaprojtectest2.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_1025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] nums = br.readLine().toCharArray();
        for (int i = 0; i < nums.length; i++) {
            int nowNum = (nums[i] - '0') * (int) Math.pow(10, nums.length - i - 1);
            System.out.println("[" + nowNum + "]");
        }
    }
}
