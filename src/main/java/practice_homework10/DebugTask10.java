package practice_homework10;

import java.util.*;

public class DebugTask10 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            String name = it.next();
            if (name.startsWith("A")) {
                it.remove();
            }
        }
        System.out.println(names);
    }
}