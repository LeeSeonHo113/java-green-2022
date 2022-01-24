// package cafe;

// import java.util.List;

// import cafe.Customer.Barista;
// import cafe.Customer.Coffee;
// import cafe.Customer.Menu;
// import cafe.Customer.MenuItem;

// class Customer {
// public void order(String menuName, Menu menu, Barista barista) {
// MenuItem menuItem = menu.choose(menuName);
// Coffee coffee = barista.makeCoffee(menuItem);
// };

// public class MenuItem {
// private String name;
// private int price;

// public MenuItem(String name, int price) {
// this.name = name;
// this.price = price;
// }

// public int getPrice() {
// return this.getPrice();
// }

// public String getName() {
// return this.getName();
// }

// }

// class Menu {
// private List<MenuItem> items;

// public Menu(List<MenuItem> items) {
// this.items = items;
// }

// public MenuItem choose(String name) {
// for (MenuItem each : items) {
// if (each.getName().equals(name)) {
// return each;
// }
// }
// return null;
// }
// }

// class Barista {
// public Coffee makeCoffee(MenuItem menuItem) {
// Coffee coffee = new Coffee(menuItem);
// return coffee;
// }
// }

// class Coffee {
// private String name;
// private int price;

// public Coffee(MenuItem menuItem) {
// this.name = menuItem.getName();
// this.price = menuItem.getPrice();
// }
// }
// }

// public class Cafe {
// public static void main(String[] args) {
// Customer c1 = new Customer();
// MenuItem m1 = new MenuItem("아메리카노", 1500);
// Menu m2 = new Menu();
// Coffee c2 = new Coffee();

// System.out.println(c1, );
// }
// }
