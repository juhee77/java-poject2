package com.example.javaprojtectest2.week9.mon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MyStackTest {
    @Test
    public void myStack() {
        MyStack myStack2 = new MyStack(50);
        assertThat(myStack2.size()).isEqualTo(0);
        assertThat(myStack2.capacity()).isEqualTo(50);
        myStack2.push(24);
        assertThat(myStack2.size()).isEqualTo(1);
        assertThat(myStack2.peek()).isEqualTo(24);
    }
}