package practice_homework9.task15;

import java.util.List;
import java.util.stream.Collectors;

public class StringConverter {
    public List<Integer> mapToLengths(List<String> words) {
        return words.stream().map(String::length).collect(Collectors.toList());
    }
}
