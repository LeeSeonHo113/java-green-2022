package ex22;

import java.util.Random;
import java.util.HashSet;
import java.util.Set;

public class CollectionEx03 {
    public static void main(String[] args) {
        Random r = new Random();

        // HashSet 생성
        Set<Integer> datas = new HashSet<>();

        while (true) {
            int n = r.nextInt(45) + 1; // 2 = 0~1
            System.out.println(n);
            // HashSet 에 n값을 add해서 저장
            datas.add(n);
            // HashSet 데이터 크기가 6이 되면 break
            if (n == 6)
                break;
        }
        // HashSet 데이터 출력!!
        System.out.println(datas);
    }
}
