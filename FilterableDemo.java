interface Filterable {
    void apply_filter();
    void reset_filter();
}

class ImageProcessor implements Filterable {
    public void apply_filter() { System.out.println("Image Filter"); }
    public void reset_filter() { System.out.println("Reset Image"); }
}

public class FilterableDemo {
    public static void main(String[] args) {
        ImageProcessor i = new ImageProcessor();
        i.apply_filter();
        i.reset_filter();
    }
}