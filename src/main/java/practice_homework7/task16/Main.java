package practice_homework7.task16;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> listOfString = Arrays.asList("one", "two", "three");
        Map<Character, List<String>> listByLetter= listOfString.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(listByLetter);
    }
}
