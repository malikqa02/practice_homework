package practice_homework9.task14;

import java.util.Arrays;

public class AverageInt {
    public double findAverage(int[] numbers) {
        return Arrays.stream(numbers).average().orElseThrow();
    }
}
