package com.example.javaprojtectest2.week4.day5.fileParser;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class FileReaderTest {
    public FileReaderTest(String s) {
    }

    public String[] read() {
        return new String[5];
    }

    public static void main(String[] args) throws IOException {
        String fileName = "/Users/bagjuhui/Desktop/hospital.csv";
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "MS949"));

        System.out.println(br.readLine());
        System.out.println(br.readLine());
    }

    public List<String> getLines(String fileName) {
        List<String> lines = new ArrayList<>();
        try (
                BufferedReader br2 = new BufferedReader(new FileReader(fileName, Charset.forName("EUC-KR")));
        ) {
            String line;
            while ((line = br2.readLine()) != null) {
                System.out.println(line);
                lines.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }
}
