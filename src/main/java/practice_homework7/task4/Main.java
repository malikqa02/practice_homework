package practice_homework7.task4;

import java.util.function.Function;

public class Main {
    static Function<String, Integer> lengthOfString = (x -> x.length());
    public static void main(String[] args) {
        System.out.println(lengthOfString.apply("1234567"));
    }
}
