package ex06;

import java.util.Scanner;

public class Pay {
    public static void main(String[] args) {
        final int RATE = 5000;
        int pay; // 임금
        int hours; // 시간
        Scanner input = new Scanner(System.in);

        System.out.println("시간을 입력하시오. : "); // 입력 안내 출력
        hours = input.nextInt();

        if (hours > 8)
            pay = RATE * 8 + (int) (1.5 * RATE * (hours - 8));
        else
            pay = RATE * hours;
        System.out.printf("임금은 %d입니다.\n", pay);
    }
}
