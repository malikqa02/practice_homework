package practice_homework9.task20;

import java.util.Arrays;

public class DuplicatesChecker {
    public boolean hasDuplicates(int[] numbers) {
        return Arrays.stream(numbers).distinct().count() != numbers.length;
    }
}
