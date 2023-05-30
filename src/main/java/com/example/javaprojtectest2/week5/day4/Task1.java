package com.example.javaprojtectest2.week5.day4;

import java.util.Stack;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(new Task1().checkPairWithReplace("()()()"));
        System.out.println(new Task1().checkPairWithReplace("()()("));
        System.out.println(new Task1().checkPairWithReplace("(((())))"));   System.out.println(new Task1().checkPairWithReplace("()()()"));
        System.out.println(new Task1().checkPairWithSplit("()()("));
        System.out.println(new Task1().checkPairWithSplit("(((())))"));

        System.out.println(new Task1().checkPairWithStack("()()()()"));
        System.out.println(new Task1().checkPairWithStack("()(()"));
        System.out.println(new Task1().checkPairWithStack(")(()"));

    }

    public boolean checkPairWithReplace(String str) {
        while (str.contains("()")) { //str.indexOf(str)!=-1
            str = str.replace("()", "");
        }
        return str.isBlank();
        //-> O(n^2)
    }

    public boolean checkPairWithSplit(String str) {
        while (str.contains("()")){
            String[] split = str.split("\\(\\)"); //()중심으로 나눈다.
            str = String.join("", split);
        }
        return str.isBlank();
        //-> O(n^2)
    }

    public boolean checkPairWithStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (char nowC : str.toCharArray()) {
            if (nowC == '(') {
                stack.push(nowC);
            } else {
                if(stack.isEmpty()) return false; // '('가 없는데 ')'개 들어온 경우
                stack.pop();
            }
        }
        return stack.isEmpty();
    }


}
