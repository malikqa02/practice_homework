package practice_homework5.LinkedHashMapTask2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>();
        numbers.put("Bob", 1223344);
        numbers.put("Max", 222222);
        System.out.println(numbers.get("Max"));
    }
}
