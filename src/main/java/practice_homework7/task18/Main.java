package practice_homework7.task18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        Double averageNum = nums.stream()
                .collect(Collectors.averagingInt(n -> n));
        System.out.println(averageNum);
    }
}
