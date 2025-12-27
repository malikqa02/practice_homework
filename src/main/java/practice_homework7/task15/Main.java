package practice_homework7.task15;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listOfString = Arrays.asList("one", "two", "three");
        boolean t = listOfString.stream()
                .anyMatch(x -> x.equals("one"));
        System.out.println(t);
    }
}
