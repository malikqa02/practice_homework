package practice_homework9.task4;

import java.util.Arrays;

public class FindMaxNum {
    public int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }
}
