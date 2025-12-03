package practice_homework5.HashMapTask3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void printUnderage(Map<String, Integer> map){
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (entry.getValue() < 18){
                System.out.println(entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alex",12);
        map.put("Misha",21);
        map.put("Leo",13);
        map.put("Bob",15);
        map.put("Ali",30);
        printUnderage(map);
    }

}