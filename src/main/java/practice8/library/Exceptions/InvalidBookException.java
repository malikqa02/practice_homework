package practice8.library.Exceptions;

//непроверяемый. непроверяемое исключение в java это либо error либо RunTimeException

public class InvalidBookException extends RuntimeException{
    public InvalidBookException(String message) {
        super(message);
    }
}
