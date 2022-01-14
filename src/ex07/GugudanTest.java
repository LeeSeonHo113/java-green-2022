package ex07;

import java.util.Scanner;

public class GugudanTest {
    public static void main(String[] args) {
        int n1;
        int n2;
        System.out.println("출력할 구구단의 범위를 입력하시오. : ");
        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        System.out.println("");
        System.out.println("");

        for (n1 = n1; n1 <= n2; n1++) {
            for (int i = 1; i < 10; i++) {
                System.out.println(n1 + "*" + i + "=" + (n1 * i));
            }
            System.out.println("");
            System.out.println("");
        }
    } // 메인 끝
}
