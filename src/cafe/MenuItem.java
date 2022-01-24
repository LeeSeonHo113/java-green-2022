package cafe;

// 아메리카노, 카페라떼, 캬라멜 마끼야또, 카페모카
public class MenuItem {
    private String name;
    private int price;

    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
