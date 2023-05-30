package com.example.javaprojtectest2.week7.day2;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Game369Test {

    @Test
    public void test369_1(){
        Game369 game369 = new Game369();
        Assertions.assertThat(game369.find369(15)).isEqualTo(0);
        Assertions.assertThat(game369.find369(13)).isEqualTo(1);
        Assertions.assertThat(game369.find369(36)).isEqualTo(2);
        Assertions.assertThat(game369.find369(333)).isEqualTo(3);
    }
}