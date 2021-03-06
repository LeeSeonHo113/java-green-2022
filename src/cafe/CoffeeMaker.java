package cafe;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMaker {
    public static void main(String[] args) {
        // 0. 카페라는 세상을 만들기
        Customer customer = new Customer();
        Barista barista = new Barista();

        MenuItem m1 = new MenuItem("아메리카노", 1500);
        MenuItem m2 = new MenuItem("카페라떼", 2000);
        MenuItem m3 = new MenuItem("캬라멜 마끼야또", 3000);
        MenuItem m4 = new MenuItem("카페모카", 4000);
        List<MenuItem> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);

        Menu menu = new Menu(list);

        // 1. 커피를 주문하자!!
        customer.order("아메리카노", menu, barista);
    }
}
