package practice_homework5.TreeMapTask1;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> marks = new TreeMap<>();
        marks.put("a", 10);
        marks.put("c", 5);
        marks.put("d", 20);
        marks.put("b", 15);
        for (Map.Entry<String, Integer> names : marks.entrySet()){
            System.out.println(names.getKey() + " = " + names.getValue());
        }
    }
}
