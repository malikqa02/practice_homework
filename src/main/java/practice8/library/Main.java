package practice8.library;

import practice8.library.Exceptions.BookNotFoundException;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("oruell", "1984"));
        library.addBook(new Book("martin iden", "hz"));
        library.addBook(new Book("onegin", "pushkin"));
        try {
            library.findBook("aasd");
        } catch (BookNotFoundException e) {
            System.out.println("Поймали исключение");
        }
    }
}
