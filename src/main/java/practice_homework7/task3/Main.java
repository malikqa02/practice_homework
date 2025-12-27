package practice_homework7.task3;

import java.util.function.Predicate;

public class Main {
    static Predicate<Integer> evenNumbersCheck = (x -> x % 2 == 0);

    public static void main(String[] args) {
        System.out.println(evenNumbersCheck.test(19));
    }
}
