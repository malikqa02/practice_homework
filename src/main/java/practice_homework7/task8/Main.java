package practice_homework7.task8;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("o","tw","thr","four");
        List<Integer> lengthOfStrings = listOfStrings.stream()
                .map(x -> x.length())
                .collect(Collectors.toList());
        System.out.println(lengthOfStrings);
    }
}
