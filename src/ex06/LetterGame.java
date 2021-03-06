package ex06;

// 반복을 이용한 게임 프로그램
import java.util.Scanner;

public class LetterGame {
    public static void main(String[] args) {
        int answer = 59; // 정답
        int guess;
        int tries = 0;
        Scanner scan = new Scanner(System.in);
        // 반복 구조
        do {
            System.out.println("정답을 추측하여 보시오. : ");
            guess = scan.nextInt();
            tries++;

            if (guess > answer) // 사용자가 입력한 정수가 정답보다 높으면
                System.out.println("제시한 정수가 높습니다.");
            if (guess < answer) // 사용자가 입력한 정수가 정답보다 낮으면
                System.out.println("제시한 정수가 낮습니다.");
        } while (guess != answer);
        System.out.printf("축하합니다. 시도 횟수=%d\n", tries);
    }
}
