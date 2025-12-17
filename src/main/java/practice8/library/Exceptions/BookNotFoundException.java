package practice8.library.Exceptions;

public class BookNotFoundException extends Exception{
    //проверяемое исключение - значит наследуем от Exception
    public BookNotFoundException(String message) {
        super(message);
    }
}
