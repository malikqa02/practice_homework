package practice_homework7.task12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> minNum = numbers.stream()
                .min(Comparator.naturalOrder());

        System.out.println(minNum.get());
    }
}
