package practice_homework9.task8;

import java.util.Arrays;

public class FindSecondMax {
    public int findSecondMaxNum(int[] numbers) {
        return Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().orElseThrow();
    }


}
