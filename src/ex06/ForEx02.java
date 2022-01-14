package ex06;

public class ForEx02 {
    // 2의 24승을 출력하시오.
    public static void main(String[] args) {
        long result = 1;
        for (int n = 1; n < 25; n++) {
            System.out.println(n);

            // 연산!!
            result = result * 2;
            // 조건을 걸어서 출력!! or
            System.out.println(result);
        } // 여기서 출력!!
    } // 메인 끝
}
