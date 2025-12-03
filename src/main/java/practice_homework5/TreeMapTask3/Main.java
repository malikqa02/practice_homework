package practice_homework5.TreeMapTask3;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> marks = new TreeMap<>();
        marks.put("a", 10);
        marks.put("c", 5);
        marks.put("d", 20);
        marks.put("b", 15);
        System.out.println(marks.higherKey("b"));
        System.out.println(marks.lowerKey("b"));
    }
}

