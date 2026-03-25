class Shape {
    void display() { System.out.println("Shape"); }
}

class Circle2 extends Shape {
    void area() { System.out.println("Circle Area"); }
}

public class ShapeInheritanceDemo {
    public static void main(String[] args) {
        Circle2 c = new Circle2();
        c.display();
        c.area();
    }
}