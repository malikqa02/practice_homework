package practice8.library;

import practice8.library.Exceptions.BookNotFoundException;
import practice8.library.Exceptions.InvalidBookException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Library {
    private List<Book> books;
    public Library(){
        this.books = new ArrayList<>();
    }

    //добавлять книгу
    //обработка исключения: если мы добавляем существующую книгу, то
    // получаем непроверяемое исключение InvalidBookException
    public void addBook(Book book) throws InvalidBookException {
        if (books.contains(book)) {
            throw new InvalidBookException("Такая книга существует!");
        } else {
            books.add(book);
        }
    }
    //искать книгу
    //обработка исключения: если мы не можем найти книгу, то
    // то случится проверяемое исключение BookNotFoundException
    public Book findBook (String name) throws BookNotFoundException {
        AtomicReference<Book> foundBook = new AtomicReference<>();
        books.forEach(book -> {
            if (book.getName() == name) {
                foundBook.set(book); //foundBook = book
            }
        });
        if (foundBook.get() == null){
            throw new BookNotFoundException("Книга не найдена " + name);
        }
        return foundBook.get();

    }

}
