package com.example.javaprojtectest2.week9.tue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Stack;

public class InfixToPostfix {
    private static final HashMap<Character, Integer> inStackPriority = new HashMap<>();

    public InfixToPostfix() {
        inStackPriority.put('(', 0);
        inStackPriority.put('+', 1);
        inStackPriority.put('-', 1);
        inStackPriority.put('*', 2);
        inStackPriority.put('/', 2);
    }

    public String converter(String input) {

        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (char token : input.toCharArray()) {
            if (Character.isDigit(token)) {
                ans.append(token);
            } else if (token == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    ans.append(stack.pop());
                }

                if (stack.isEmpty()) {
                    throw new RuntimeException("불가능한 수식");
                }
                stack.pop();

            } else { //연산자
                int nowPriority = inStackPriority.get(token);
                while (token != '(' && !stack.isEmpty() && inStackPriority.get(stack.peek()) >= nowPriority) {
                    ans.append(stack.pop());
                }
                stack.push(token);
            }
        }

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        return ans.toString();
    }

    public static void main(String[] args) throws IOException {
        InfixToPostfix postfixConverter = new InfixToPostfix();
        System.out.println(postfixConverter.converter("1+2"));
        System.out.println(postfixConverter.converter("(1+3)*4"));
        System.out.println(postfixConverter.converter("5+3*1+(4-9)*3"));

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println(postfixConverter.converter(br.readLine()));
    }
}
