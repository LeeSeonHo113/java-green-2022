package ex06;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i <= 10; i++)
            sum += i;

        System.out.printf("1부터 10까지 정수의 합은 %d\n", sum);
    }
}
