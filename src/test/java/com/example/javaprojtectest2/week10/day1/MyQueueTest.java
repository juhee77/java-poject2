package com.example.javaprojtectest2.week10.day1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class MyQueueTest {
    @Test
    public void test(){
        //생성자로 사이즈 지정하는 경우
        MyQueueByArrError queue = new MyQueueByArrError(4);
        assertThat(queue.capacity()).isEqualTo(4);
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(15);
        assertThat(queue.size()).isEqualTo(3);
        assertThat(queue.dequeue()).isEqualTo(5);
        assertThat(queue.isEmpty()).isFalse();

        //error
        queue.enqueue(20);
        assertThat(queue.size()).isEqualTo(3);

        assertThatThrownBy(() -> queue.enqueue(35))
                .isInstanceOf(RuntimeException.class)
                .hasMessage("용량이 초과 되었습니다."); //size가 3인데 배열 초과

    }
    @Test
    public void test2(){
        //배열을 밀어서 저장하는경우 -> 비 효율적이다.
        MyQueueByArr queue = new MyQueueByArr(4);
        assertThat(queue.capacity()).isEqualTo(4);
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(15);
        assertThat(queue.size()).isEqualTo(3);
        assertThat(queue.dequeue()).isEqualTo(5);
        assertThat(queue.isEmpty()).isFalse();

        queue.enqueue(20);
        assertThat(queue.size()).isEqualTo(3);

        queue.enqueue(35);
        assertThat(queue.size()).isEqualTo(4); //가능은 하지만 비 효율적
    }
    @Test
    public void test3(){
        //원형큐를 이용하는 경우
        MyQueueByCircularArr queue = new MyQueueByCircularArr(4);
        assertThat(queue.capacity()).isEqualTo(4);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        assertThat(queue.size()).isEqualTo(3);
        assertThat(queue.dequeue()).isEqualTo(5);
        assertThat(queue.isEmpty()).isFalse();

        queue.enqueue(20);
        assertThat(queue.size()).isEqualTo(3);

        queue.enqueue(35);
        //10 15 20 35
        assertThat(queue.peek()).isEqualTo(10);
        assertThat(queue.size()).isEqualTo(4); //가능은 하지만 비 효율적
    }

}