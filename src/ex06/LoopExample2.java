package ex06;

import java.util.Scanner;

public class LoopExample2 {
    // while 문을 이용한 구구단 출력 프로그램
    public static void main(String[] args) {
        int n;
        int i = 1;
        System.out.println("구구단을 출력하고 싶은 정수를 입력하세요.");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        while (i <= 9) {
            System.out.println(n + "*" + i + "=" + n * i);
            i++;
        }
    } // 메인 끝
}
