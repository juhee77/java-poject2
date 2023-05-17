package com.example.javaprojtectest2.week5.day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MystackTest {
    @Test
    void stackTest() {
        //용량 체크
        Mystack mystack = new Mystack();
        assertEquals(100, mystack.capacity());

        //용량 체크
        Mystack mystack1 = new Mystack(2);
        assertEquals(2, mystack1.capacity());


        //기능 체크
        mystack.push(3);
        mystack.push(5);
        assertEquals(2, mystack.size());
        assertEquals(5, mystack.peek());

        //스택인 빈경우 체크
        assertThrows(RuntimeException.class, mystack1::peek);

        //스택이 가득 찬 경우 체크
        mystack1.push(4);
        mystack1.push(6);
        assertThrows(RuntimeException.class ,() -> mystack1.push(5));
    }

}