package com.example.javaprojtectest2.week4.day4.my;

import java.util.Objects;

class Student implements Comparable<Student> {
    int testId;
    String name;

    public Student(int index, String name) {
        this.testId = index;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return testId - o.testId;
    }

    @Override
    public String toString() {
        return testId + " " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return testId == student.testId && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testId, name);
    }
}