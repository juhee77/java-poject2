package com.example.javaprojtectest2.week9.mon;

import java.util.Stack;

public class MyStack {
    private final int[] arr;
    private int top = -1;

    public MyStack() {
        arr = new int[10];
    }

    public MyStack(int size) {
        arr = new int[size];
    }

    public void push(int x) {
        if (top == arr.length - 1) {
            throw new RuntimeException("stack is full");
        }
        top++;
        arr[top] = x;
        // arr[++top] = x;
    }

    public int pop() {
        if (this.isEmpty()) {
            throw new RuntimeException("stack is empty");
        }
        int value = arr[top];
        top--;
        return value;
        // return arr[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int peek() {
        if (this.isEmpty()) {
            throw new RuntimeException("stack is empty");
        }
        return arr[top];
    }

    public int capacity() {
        return arr.length;
    }

    public int size() {
        return top + 1;
    }

    // main method for testing
    public static void main(String[] args) {
        MyStack myIntegerStack = new MyStack();
        myIntegerStack.push(10);
        myIntegerStack.push(20);
        System.out.println(myIntegerStack.pop());
        myIntegerStack.push(30);
        System.out.println(myIntegerStack.peek());
        System.out.println(myIntegerStack.pop());

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(5);

        System.out.println(stack.peek());
        stack.pop();

        System.out.println(stack.pop());
        System.out.println(stack.capacity());
        System.out.println(stack.size());
    }
}
