package com.example.javaprojtectest2.week11.day3.programmers.word43163;

import annotation.LogExecutionTime;
import org.aspectj.lang.annotation.Around;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class LectureBfsSolutionTest {

    @Test
    @LogExecutionTime
    @DisplayName("DfsSolution")
    public void test1() {
        DfsSolution solution = new DfsSolution();
        Assertions.assertThat(solution.solution("hit", "cog",
                new String[]{"hot", "dot", "dog", "lot", "log", "cog"})).isEqualTo(4);
        Assertions.assertThat(solution.solution("hit", "hat",
                new String[]{"hat", "dot", "dog", "lot", "log", "cog"})).isEqualTo(1);

    }

    @Test
    @DisplayName("BfsSolution")
    public void test2() {
        BfsSolution solution = new BfsSolution();
        Assertions.assertThat(solution.solution("hit", "cog",
                new String[]{"hot", "dot", "dog", "lot", "log", "cog"})).isEqualTo(4);
        Assertions.assertThat(solution.solution("hit", "hat",
                new String[]{"hat", "dot", "dog", "lot", "log", "cog"})).isEqualTo(1);

    }

    @Test
    @DisplayName("BfsSolutionArray")
    public void test3() {
        BfsSolutionArray solution = new BfsSolutionArray();
        Assertions.assertThat(solution.solution("hit", "cog",
                new String[]{"hot", "dot", "dog", "lot", "log", "cog"})).isEqualTo(4);
        Assertions.assertThat(solution.solution("hit", "hat",
                new String[]{"hat", "dot", "dog", "lot", "log", "cog"})).isEqualTo(1);

    }

    @Test
    @DisplayName("LectureBfsSolution")
    public void test4() {
        LectureBfsSolution solution = new LectureBfsSolution();
        Assertions.assertThat(solution.solution("hit", "cog",
                new String[]{"hot", "dot", "dog", "lot", "log", "cog"})).isEqualTo(4);
        Assertions.assertThat(solution.solution("hit", "hat",
                new String[]{"hat", "dot", "dog", "lot", "log", "cog"})).isEqualTo(1);

    }

}