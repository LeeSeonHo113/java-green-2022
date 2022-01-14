package ex06;

public class ForEx01 {
    public static void main(String[] args) {

        // 3의 배수 출력
        for (int n = 1; n < 100; n = n + 1) {
            if (n % 3 == 0) {
                System.out.println(n);
            }
        }
    }
}
