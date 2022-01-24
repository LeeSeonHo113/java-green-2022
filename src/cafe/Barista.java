package cafe;

public class Barista {
    public Coffee makeCoffee(MenuItem menuItem) {
        // 4. 커피를 뽑자!!
        Coffee coffee = new Coffee(menuItem);
        return coffee;
    }
}
