package practice_homework7.task6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> listOfString = Arrays.asList("aaa","aaaaaa", "a");
        List<String> listOfStringBiggerThan5 = listOfString.stream()
                .filter(x -> x.length() > 5)
                .collect(Collectors.toList());
        System.out.println(listOfStringBiggerThan5);
    }
}
