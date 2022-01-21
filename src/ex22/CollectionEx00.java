package ex22;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;
import java.util.List;
import java.util.Collections;

public class CollectionEx00 {
    public static void main(String[] args) { // 메인 시작
        // 6개의 로또번호를 정한다. - ArrayList 담기
        ArrayList<Integer> datas = new ArrayList<>();
        datas.add(3);
        datas.add(5);
        datas.add(30);
        datas.add(40);
        datas.add(41);
        datas.add(42);

        System.out.println(datas);

        // Scanner로 금액을 입력받는다(ex : 5000원 -> 5회).
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        System.out.println("금액을 입력하세요. : " + money);
        System.out.println("로또 횟수 : " + money / 1000);

        // HashSet으로 번호 받기, 그 후 순서대로 정렬하기
        // 입력받을 금액에 따라 ArrayList에 담기
        Random r = new Random();
        ArrayList<List<Integer>> buyLotto = new ArrayList<>();

        // 5번 실행
        for (int i = 0; i < 5; i++) {
            HashSet<Integer> lotto = new HashSet<>();
            while (true) {
                int num = r.nextInt(45) + 1;
                lotto.add(num);

                if (lotto.size() == 6) {
                    break;
                }
            }

            List<Integer> lottoList = new LinkedList<>(lotto);
            Collections.sort(lottoList);

            // 로또 번호 세트
            buyLotto.add(lottoList);
        }

        for (int i = 0; i < buyLotto.size(); i++) {
            System.out.println(buyLotto.get(i));
        }

        // 1번 ArrayList와 2번 ArrayList를 비교해서 당첨됐는지 확인해서 출력하기
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);

        list2.add(2);
        list2.add(2);
        list2.add(2);
        list2.add(2);
        list2.add(2);
        list2.add(2);

        boolean failCheck = false;
        for (int i = 0; i < 6; i++) {
            if (list1.get(i) != list2.get(i)) {
                failCheck = true;
                System.out.println("당첨되지 않으셨습니다.");
                break;
            }
        }

        if (failCheck == false) {
            System.out.println("당첨되었습니다");
        }

    } // 메인 끝
}
