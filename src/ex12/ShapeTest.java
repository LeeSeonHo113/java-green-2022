package ex12;

class Shape {
    int x, y;
}

class Rectangle extends Shape {
    int width, height;
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape s;

        Rectangle r = new Rectangle();
        // Rectangle r;
        // Shape s;
        s = new Rectangle();

        r = (Rectangle) s;

        // r->width=100;
        // r->height=100;

        s = r;
        s.x = 0;
        s.y = 0;
        // s.width = 100;
        // s.height = 100;
    }
}
