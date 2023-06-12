package com.example.javaprojtectest2.week9.mon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//각 괄호가 닫히는지 확인
public class BarTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BarTest barTest = new BarTest();
        System.out.println(barTest.isRightBar(br.readLine()));
    }

    public boolean isRightBar(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) { //괄호가 없는 경우
                    return false;
                }

                if (c == ']' && stack.peek() != '[') {
                    return false;
                } else if (c == '}' && stack.peek() != '{') {
                    return false;
                } else if (c == ')' && stack.peek() != '(') {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}

