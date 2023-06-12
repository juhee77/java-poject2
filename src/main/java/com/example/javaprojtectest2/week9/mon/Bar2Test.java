package com.example.javaprojtectest2.week9.mon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//대괄호, 중괄호, 소괄호, 규약에 맞춰서
public class Bar2Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Bar2Test bar2Test = new Bar2Test();
        System.out.println(bar2Test.isRightBar(br.readLine()));
    }

    public boolean isRightBar(String input) {
        Stack<Character> bigS = new Stack<>();
        Stack<Character> midS = new Stack<>();
        Stack<Character> smallS = new Stack<>();
        for (char c : input.toCharArray()) {
            if (c == '(') {
                smallS.add(c);
            } else if (c == '{') {
                midS.add(c);
            } else if (c == '[') {
                bigS.add(c);
            } else {
                if (c == ']') {
                    if (!midS.isEmpty() || !smallS.isEmpty() || bigS.isEmpty()) {
                        return false;
                    }
                    bigS.pop();
                } else if (c == '}') {
                    if (!smallS.isEmpty() || midS.isEmpty()) {
                        return false;
                    }
                    midS.pop();
                } else if (c == ')') {
                    if (smallS.isEmpty()) {
                        return false;
                    }
                    smallS.pop();
                }
            }
        }
        return bigS.isEmpty() && smallS.isEmpty() && midS.isEmpty();
    }
}
