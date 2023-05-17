package com.example.javaprojtectest2.week5.day3;

import java.util.Stack;

public class Infix {

    public String toPostFix(String inputStr) {
        StringBuilder sb = new StringBuilder();
        String[] inputArr = inputStr.split(" ");
        Stack<String> str = new Stack<>();
        for (String now : inputArr) {

            switch (now) {
                case "+", "-" -> {
                    //우선순위에 따라
                    while (!str.isEmpty() && (str.peek().equals("*") || str.peek().equals("/"))) {
                        sb.append(str.pop());
                    }
                    str.push(now);
                }
                case "*", "/", "(" -> str.push(now);
                case ")" -> {
                    //왼쪽 괄호 찾을때 까지
                    while (!str.isEmpty() && !str.peek().equals("(")) {
                        sb.append(str.pop());
                    }
                    str.pop(); //왼쪽 괄호 pop
                }
                default ->
                        //숫자인 경우
                        sb.append(now);
            }
        }
        //스택에 남은 것 처리
        while (!str.isEmpty()) {
            sb.append(str.pop());
        }

        return sb.toString();

    }

}
