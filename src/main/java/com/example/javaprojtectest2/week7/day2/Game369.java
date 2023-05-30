package com.example.javaprojtectest2.week7.day2;

public class Game369 {
    public static void main(String[] args) {
        Game369 game369 = new Game369();
        game369.play(100);

    }

    public void play(int num) {
        for (int i = 0; i < num; i++) {
            System.out.printf("%02d%s\n", i, "*".repeat(find369(i)));
            System.out.printf("%02d%s\n", i, "*".repeat(find369byRecursive(i)));
        }
    }

    public int find369(int num) {
        int clap = 0;
        while (0 < num) {
            if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
                clap++;
            }
            num /= 10;
        }
        return clap;
    }

    public int find369byRecursive(int num) {
        if (num == 0) return 0;
        if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
            return find369byRecursive(num / 10) + 1;
        }
        return find369byRecursive(num / 10);
    }
}
