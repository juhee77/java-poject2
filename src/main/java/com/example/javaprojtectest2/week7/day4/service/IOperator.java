package com.example.javaprojtectest2.week7.day4.service;

public interface IOperator {
    void setA(int a);
    void setB(int b);
    void generateQuestion(int max);
    String getQuestionMsg();
    boolean isEqueals(int answer);
}
