package practice_homework5.HashSetTask3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static Set<String> removeDuplicates(List<String> inputList){
        Set<String> uniqueSet = new HashSet<>();
        uniqueSet.addAll(inputList);
        return uniqueSet;
    };

    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Alice", "Charlie", "Bob");
        Set<String> uniqueNames = removeDuplicates(names);
        System.out.println(uniqueNames);
    }
}
