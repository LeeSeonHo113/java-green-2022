package ex11;

class Shape {
    public Shape() {
        System.out.println("Shape 생성자()");
    }
}

class Rectangle extends Shape {
    public Rectangle() {

        System.out.println("Rectangle 생성자()");
    }
}

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
    }
}
