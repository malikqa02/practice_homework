package practice_homework9.task3;

public class StringReverser {
    public String reverse(String input) {
        if (input == null) throw new IllegalArgumentException() ;
        return new StringBuilder(input).reverse().toString();
    }
}
