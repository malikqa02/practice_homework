package practice8.library;

import java.util.Objects;

public class Book {
    private String name;
    private String author;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author);
    }

    public Book(String author, String name) {
        this.author = author;
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }
}
