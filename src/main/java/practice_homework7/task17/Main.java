package practice_homework7.task17;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        Map<Boolean, List<Integer>> evenNumber = nums.stream()
                .collect(Collectors.groupingBy(x -> (x % 2) == 0));
        System.out.println(evenNumber);
    }
}
