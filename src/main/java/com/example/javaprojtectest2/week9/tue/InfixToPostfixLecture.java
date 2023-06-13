package com.example.javaprojtectest2.week9.tue;

import java.io.IOException;
import java.util.Stack;

public class InfixToPostfixLecture {
    // 연산자인지 검증하는 메소드
    private boolean isOperator(char token) {
        return token == '(' || token == '+' || token == '-' || token == '*' || token == '/';
    }

    // 스택 내부에서의 우선순위
    private int inStackPriority(char operator) {
        if (operator == '+' || operator == '-') return 1;
        else if (operator == '*' || operator == '/') return 2;
        else if (operator == '(') return 0; // 닫는 괄호가 나올 때까지 pop 되면 안됨
        else throw new IllegalArgumentException("Not Allowed Operator");
    }

    // 스택 외부에서의 우선순위
    private int inComingPriority(char operator) {
        if (operator == '+' || operator == '-') return 1;
        else if (operator == '*' || operator == '/') return 2;
        else if (operator == '(') return 3;
        else throw new IllegalArgumentException("not allowed argument");
    }

    public String converter(String input) {
        // 결과를 담아둘 StringBuilder
        StringBuilder answerBuilder = new StringBuilder();
        // 연산자 Stack
        Stack<Character> operStack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char token = input.charAt(i);

            if (isOperator(token)) {
                if (operStack.empty()) operStack.push(token);
                else {
                    while (!operStack.isEmpty() && inStackPriority(operStack.peek()) >= inComingPriority(token)) {
                        answerBuilder.append(operStack.pop());
                    }
                    operStack.push(token);
                }
            } else if (token == ')') {
                char top = operStack.pop();
                while (top != '(') {
                    answerBuilder.append(top);
                    top = operStack.pop();
                }
            } else answerBuilder.append(token); //숫자
        }
        while (!operStack.empty()) {
            answerBuilder.append(operStack.pop());
        }
        return answerBuilder.toString();
    }

    public static void main(String[] args) throws IOException {
        InfixToPostfixLecture postfixConverter = new InfixToPostfixLecture();
        System.out.println(postfixConverter.converter("1+2"));
        System.out.println(postfixConverter.converter("(1+3)*4"));
        System.out.println(postfixConverter.converter("5+3*1+(4-9)*3"));

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println(postfixConverter.converter(br.readLine()));
    }
}
