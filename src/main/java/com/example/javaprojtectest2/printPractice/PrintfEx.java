package com.example.javaprojtectest2.printPractice;

public class PrintfEx {
    public void print(String pokemon){
        System.out.printf("%s", pokemon);
        System.out.println("bye");
    }

    public static void main(String[] args) {
        PrintfEx printfEx = new PrintfEx();
        printfEx.print("꼬북이");
        
    }
}
