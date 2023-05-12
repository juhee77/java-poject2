package com.example.javaprojtectest2.week4.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

//가위바위보게임
public class RockGame {

    public static final int TIE = 0;
    public static final int WIN = 1;
    public static final int LOSE = -1;
    public static final String[] command = {"가위", "바위", "보"};
    public static final String INVALIDATION_INPUT_MESSAGE = "[ERROR] 잘못된 입력을 진행하셨습니다 재 입력 해주세요 \n";
    public static final String INPUT_MESSAGE = "가위(0), 바위(1), 보(2)를 입력하세요[숫자도 가능]: ";
    public static final String GAME_EXIT_MESSAGE = "게임에 승리하셔서 가위바위보 게임이 끝났습니다";

    public static void main(String[] args) throws IOException {
        playGame();
    }

    //실제 게임을 수행하는 부분
    private static void playGame() throws IOException {
        int result;
        do {
            switch (result = getResult(getInput())) {
                case WIN -> System.out.println("win");
                case LOSE -> System.out.println("lose");
                default -> System.out.println("tie");
            }
            System.out.println();
        } while (result != 1);
        System.out.println(GAME_EXIT_MESSAGE);
    }

    //유저의 인풋을 입력받는다
    private static int getInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int userCmd;
        do {
            System.out.print(INPUT_MESSAGE);
            String input = br.readLine();
            if (input.length()==1 && Character.isDigit(input.charAt(0))) {
                //숫자를 입력한 경우
                userCmd = input.charAt(0) - '0';
            } else {
                //문자를 입력한 경우
                userCmd = IntStream.range(0, command.length)
                        .filter(i -> input.equals(command[i]))
                        .findFirst()
                        .orElse(-1); //찾지 못하는 경우
            }
        } while (!isValidation(userCmd));
        return userCmd;
    }

    // 컴퓨터와의 게임 결과
    private static int getResult(int input) {
        int computer = (int) (Math.random() * 2);
        System.out.println("컴퓨터는 " + command[computer]);

        if (input == computer) {
            return TIE;
        }
        if ((input + 1) % 3 == computer % 3) {
            return WIN;
        } else {
            return LOSE;
        }
    }

    //유저 인풋 유효성 검증
    private static boolean isValidation(int input) {
        if (input < 0 || 2 < input) {
            System.out.println(INVALIDATION_INPUT_MESSAGE);
            return false;
        }
        return true;
    }
}

