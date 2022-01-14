package ex05;

// 논리연산은 둘 다 boolean 타입이어야 한다.
public class LogicalOperator {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        // 논리연산자
        // && 그리고 (AND)
        // || 거나 (OR)
        System.err.println((x == 3) && (y == 7));
        System.err.println((x == 3) || (y == 4));
    }
}
