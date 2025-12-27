package practice_homework7.task5;

import java.util.function.Consumer;

public class Main {
    static Consumer<String> someString = (x -> System.out.println(x));

    public static void main(String[] args) {
        someString.accept("текст для вывода");
    }
}
