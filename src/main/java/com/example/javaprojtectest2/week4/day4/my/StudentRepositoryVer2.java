package com.example.javaprojtectest2.week4.day4.my;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class StudentRepositoryVer2 {
    List<Student> students = new ArrayList<>();
    HashMap<Integer, Student> studentsPoll = new HashMap<>();

    public StudentRepositoryVer2() {

    }

    public void insertStudent(int testId, String name) {
        if (!isContains(testId)) { //중복되지 않는 경우에만
            Student newStudent = new Student(testId, name);
            students.add(newStudent);
            studentsPoll.put(testId, newStudent);
        }
    }

    public void deleteStudent(int testId, String name) {
        if (isContains(testId)) {
            Student findStudent = getStudentByTestId(testId);
            students.remove(findStudent);
            studentsPoll.remove(testId);
        }
    }

    public void sortStudent() {
        Collections.sort(students);
    }

    public boolean isContains(int testId) {
        if (studentsPoll.containsKey(testId)) {
            return true;
        }
        return false;
    }

    public Student getStudentByTestId(int testId) {
        return studentsPoll.get(testId);
    }

    public Student getStudent(int index) {
        return students.get(index - 1);
    }

}