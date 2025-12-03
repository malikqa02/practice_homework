package practice_homework5.HashSetTask2;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(nums.contains(2));
        System.out.println(nums.contains(22));
    }
}
