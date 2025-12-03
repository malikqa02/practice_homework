package practice_homework5.HashMapTask2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alex",12);
        map.put("Misha",21);
        map.put("Leo",13);
        map.put("Bob",15);
        map.put("Ali",30);
        System.out.println(map.containsKey("Leo"));
        System.out.println(map.containsValue(12));
    }
}
