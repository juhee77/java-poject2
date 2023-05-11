package com.example.javaprojtectest2.week4.day4.lecture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Codeup3108 {
    private List<Student> students = new ArrayList<>();

    public Student makeAStudent(String code, int testNum, String name) {
        // 입력 받은 값을 Object로 만들어 줌
        return new Student(code, testNum, name);
    }
    // 수험번호 중복 화인
    private boolean isExist(Student pStudent) {
        for (Student student :
                students) {
            if (pStudent.getTestId() == student.getTestId()) return true;
        }
        return false;
    }

    // 리스트에 학생 추가
    private void addAStudent(Student student) {
        if (!isExist(student)) {
            students.add(student);
        }
    }
    // 리스트에 학생 삭제
    private void deleteStudent(Student pStudent) {
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getTestId() == pStudent.getTestId()) students.remove(i);
        }
    }

    // code가 I일 경우 학생추가
    // code가 D일 경우 학생삭제
    public void process(String pStudentInput) {
        Student pStudent = convertToStudent(pStudentInput);

        switch (pStudent.getCode()) {
            case "I" -> addAStudent(pStudent);
            case "D" -> deleteStudent(pStudent);
        }
    }

    private Student convertToStudent(String pStudentInput) {
        String[] splited = pStudentInput.split(" ");
        Student pStudent = makeAStudent(splited[0], Integer.parseInt(splited[1]), splited[2]);
        return pStudent;
    }

    // print기능
    private void printStudents() {
        for (Student student : students) {
            System.out.printf("%s %s %s\n", student.getCode(), student.getTestId(), student.getName());
        }
    }

    private void printSpecificStudents(int[] arr){
        // 정렬
        Collections.sort(students, Comparator.comparingInt(Student::getTestId));

        // 출력
        for (int i = 0; i < arr.length; i++) {
            Student student = students.get(arr[i] - 1);
            System.out.printf("%s %s %s\n", student.getCode(), student.getTestId(), student.getName());
        }
    }



    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        // 데이터 하나를 넣어 Test를 하기 위함
        Student testStudent = new Student("I", 999, "백두산");

        int size = 1;

        Codeup3108 codeup3108 = new Codeup3108();
        codeup3108.process("I 1011 한라산");
        codeup3108.process("I 999 백두산");
        codeup3108.process("I 999 오대산");
        codeup3108.process("D 999 백두산");
        codeup3108.process("I 800 백두산");
        codeup3108.process("D 500 한라산");
        codeup3108.process("I 900 남산");
        codeup3108.process("I 950 금강산");
        codeup3108.process("I 1205 지리산");
        codeup3108.process("I 700 북한산");
        codeup3108.printSpecificStudents(new int[]{1, 2, 4, 5, 6});

    }
}