package com.example.javaprojtectest2.week11.day3.programmers.network43162;

import annotation.LogExecutionTime;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class Network4316Test {
    @LogExecutionTime
    @Test
    public void BFS() {
        BfsSolution solution = new BfsSolution();
        Assertions.assertThat(solution.solution(3, new int[][]{
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        })).isEqualTo(2);

    }

    @LogExecutionTime
    @Test
    public void DFS() {
        DfsSolution solution = new DfsSolution();
        Assertions.assertThat(solution.solution(3, new int[][]{
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        })).isEqualTo(2);
    }


    @Test    @LogExecutionTime
    public void UNIONFIND() {
        UnionFindSolution solution = new UnionFindSolution();
        Assertions.assertThat(solution.solution(3, new int[][]{
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        })).isEqualTo(2);

    }

    @LogExecutionTime
    @Test
    public void LECTUREDFS() {
        LectureBfsSolution solution = new LectureBfsSolution();
        Assertions.assertThat(solution.solution(3, new int[][]{
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        })).isEqualTo(2);


    }
}