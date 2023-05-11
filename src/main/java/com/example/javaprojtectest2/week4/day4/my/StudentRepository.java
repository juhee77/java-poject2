package com.example.javaprojtectest2.week4.day4.my;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StudentRepository {
    //해시로 하고 싶댱
    List<Student> students = new ArrayList<>();
    List<Integer> indexes = new ArrayList<>();

    public StudentRepository() {

    }

    public void insertStudent(int testId, String name) {
        if (!isContains(testId)) { //중복되지 않는 경우에만
            students.add(new Student(testId, name));
            indexes.add(testId);
        }
    }

    public void deleteStudent(int testId, String name) {
        if (isContains(testId)) {
            Student student = getStudentByTestId(testId);

            //이름은 비교하지 않는다.
            students.remove(student);
            indexes.remove(testId);
        }
    }

    public void sortStudent() {
        Collections.sort(students);
    }

    public boolean isContains(int testId) {
        if (indexes.contains(testId)) {
            return true;
        }
        return false;
    }

    public Student getStudentByTestId(int testId) {
        int nowIndex = indexes.indexOf(testId);
        return students.get(nowIndex);
    }

    public Student getStudent(int index) {
        return students.get(index - 1);
    }

}