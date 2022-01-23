package ex05;

public class ArithmeticOperator {
    public static void main(String[] args) {
        int result;
        double resultDouble;

        result = 3 + 2;
        System.out.println(result);
        result = 3 - 2;
        System.out.println(result);
        result = 3 * 2;
        System.out.println(result);
        result = 3 / 2; // 정수 계산의 경우, 소수점 이하 부분은 없어진다.
        System.out.println(result);
        resultDouble = 3.0 / 2.0;
        System.out.println(resultDouble);
        result = 3 % 2;
        System.out.println(result);
    }
}
