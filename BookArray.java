class Book2 {
    String title, author;
    int price;

    Book2(String t, String a, int p) {
        title = t; author = a; price = p;
    }
}

public class BookArray {
    public static void main(String[] args) {
        Book2[] b = {
            new Book2("Java","James",500),
            new Book2("Python","Guido",600)
        };

        for (Book2 x : b)
            System.out.println(x.title);
    }
}