public class RectangleDemo {
    int l, b;

    RectangleDemo(int l, int b) {
        this.l = l;
        this.b = b;
    }

    int Area() {
        return l * b;
    }

    public static void main(String[] args) {
        RectangleDemo r1 = new RectangleDemo(4,5);
        RectangleDemo r2 = new RectangleDemo(5,8);

        System.out.println(r1.Area());
        System.out.println(r2.Area());
    }
}