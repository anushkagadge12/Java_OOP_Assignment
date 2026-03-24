abstract class Shape {
    abstract void calculate_area();
    void display() { System.out.println("Shape"); }
}

class Circle extends Shape {
    void calculate_area() {
        System.out.println("Circle Area");
    }
}

public class ShapeAbstractDemo {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.calculate_area();
        s.display();
    }
}