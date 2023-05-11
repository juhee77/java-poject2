package com.example.javaprojtectest2.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class no_3108 {
    private static class Student implements Comparable<Student> {
        int index;
        String name;

        public Student(int index, String name) {
            this.index = index;
            this.name = name;
        }

        @Override
        public int compareTo(Student o) {
            return index - o.index;
        }

        @Override
        public String toString() {
            return index + " " + name;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, String> allStudents = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            char cmd = st.nextToken().charAt(0);
            int idx = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            if (cmd == 'I') {
                if (!allStudents.containsKey(idx)) allStudents.put(idx, name);
            } else {
                allStudents.remove(idx);
            }
        }


        List<Student> students = new ArrayList<>();
        for (Integer idx : allStudents.keySet()) {
            students.add(new Student(idx, allStudents.get(idx)));
        }
        Collections.sort(students);

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int now = Integer.parseInt(st.nextToken());
            sb.append(students.get(now - 1)).append("\n");
        }
        System.out.println(sb);

//        for (var student : students) { //타입 지정 하지 않는
//            System.out.println(student);
//        }

    }

}
