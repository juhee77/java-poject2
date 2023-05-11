package com.example.javaprojtectest2.week4.day4.my;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_3108OOP {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringBuilder sb = new StringBuilder();
    private static StudentRepositoryVer2 studentRepository = new StudentRepositoryVer2();
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            char cmd = st.nextToken().charAt(0);
            int testId = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            if (cmd == 'I') {
                studentRepository.insertStudent(testId, name);
            } else {
                studentRepository.deleteStudent(testId, name);
            }
        }

        printInputIndexesStudent();
        System.out.println(sb);

    }

    private static void printInputIndexesStudent() throws IOException {
        st = new StringTokenizer(br.readLine());
        studentRepository.sortStudent();

        while (st.hasMoreTokens()) {
            sb.append(studentRepository.getStudent(Integer.parseInt(st.nextToken()))).append("\n");
        }
    }

}
