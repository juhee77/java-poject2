package com.example.javaprojtectest2.week9.tue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PostfixCalculation {
    public int solution(String input) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char token = input.charAt(i);

            if (Character.isDigit(token)) {
                stack.push(token - '0');
            } else {
                int num2 = stack.pop();
                int num1 = stack.pop();

                int ans = calculate(token, num1, num2);
                stack.push(ans);
            }
        }

        if (stack.size() != 1) {
            throw new RuntimeException("잘못된 수식입니다.");
        }
        return (stack.pop());
    }

    private static int calculate(char operand, int num1, int num2) {
        return switch (operand) {
            case '-' -> num1 - num2;
            case '+' -> num1 + num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> throw new RuntimeException("잘못된 문자입니다.");
        };
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PostfixCalculation postfixCalculation = new PostfixCalculation();
        System.out.println(postfixCalculation.solution(br.readLine()));
    }
}
