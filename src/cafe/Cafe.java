// package cafe;

// import java.util.List;
// import java.util.ArrayList;

// public class Customer {
// public void order(String menuName, Menu menu, Barista barista) {
// MenuItem menuItem = menu.choose(menuName);
// if (menuItem == null) {
// System.out.println("찾은 메뉴가 없습니다.");
// }
// Coffee coffee = barista.makeCoffee(menuItem);

// System.out.println("커피를 받았습니다.");
// System.out.println("커피이름 : " + coffee.getName());
// System.out.println("커피가격 : " + coffee.getPrice());
// };

// public class MenuItem {
// private String name;
// private int price;

// public MenuItem(String name, int price) {
// this.name = name;
// this.price = price;
// }

// public String getName() {
// return name;
// }

// public int getPrice() {
// return price;
// }

// }

// public class Menu {
// private List<MenuItem> items;

// public Menu(List<MenuItem> items) {
// this.items = items;
// }

// public MenuItem choose(String menuName) {
// for (MenuItem item : items) {
// if (item.getName().equals(menuName)) {
// return item;
// }
// }
// return null;
// }
// }

// public class Barista {
// public Coffee makeCoffee(MenuItem menuItem) {
// Coffee coffee = new Coffee(menuItem);
// return coffee;
// }
// }

// public class Coffee {
// private String name;
// private int price;

// public Coffee(MenuItem menuItem) {
// this.name = menuItem.getName();
// this.price = menuItem.getPrice();
// }

// public String getName() {
// return name;
// }

// public int getPrice() {
// return price;
// }
// }
// }

// public class Cafe {
// public static void main(String[] args) {
// Customer customer = new Customer();
// Barista barista = new Barista();

// MenuItem m1 = new MenuItem("아메리카노", 1500);
// MenuItem m2 = new MenuItem("카페라떼", 2000);
// MenuItem m3 = new MenuItem("캬라멜 마끼야또", 3000);
// MenuItem m4 = new MenuItem("카페모카", 4000);
// List<MenuItem> list = new ArrayList<>();
// list.add(m1);
// list.add(m2);
// list.add(m3);
// list.add(m4);

// Menu menu = new Menu(list);
// }
// }
