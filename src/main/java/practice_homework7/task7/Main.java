package practice_homework7.task7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> listOfInts = Arrays.asList(5,12,15,25);
        List<Integer> listOfIntsDivisibleBy5 = listOfInts.stream()
                .filter(x -> x % 5 == 0)
                .collect(Collectors.toList());
        System.out.println(listOfIntsDivisibleBy5);
    }
}
