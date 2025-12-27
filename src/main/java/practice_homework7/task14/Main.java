package practice_homework7.task14;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<String> string = Arrays.asList("лес", "деревья", "береза", "дуб", "белка");
        Optional<String> firstStringB = string.stream()
                .filter(s -> s.startsWith("б"))
                .findFirst();
        System.out.println(firstStringB.get());
    }
}
