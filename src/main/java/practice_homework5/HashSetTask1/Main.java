package practice_homework5.HashSetTask1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.forEach(System.out::println);
    }
}
