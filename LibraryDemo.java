import java.util.*;

class Book {
    String title, author, isbn;

    Book(String t, String a, String i) {
        title = t; author = a; isbn = i;
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();

        list.add(new Book("Java", "James", "101"));
        list.add(new Book("Python", "Guido", "102"));

        for (Book b : list)
            System.out.println(b.title + " " + b.author);
    }
}