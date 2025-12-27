package practice_homework7.task9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> squaresOfNumbers = numbers.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println(squaresOfNumbers);
    }
}
