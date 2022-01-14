package ex06;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        long result = 1;
        int n;

        System.out.printf("정수를 입력하시오. : ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        for (int i = 1; i <= n; i++)
            result = result * i;

        System.out.printf("%d!은 %d입니다.\n", n, result);
    }
}
