package practice_homework5.LinkedHashSetTask1;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> orderedList = new LinkedHashSet<>();
        orderedList.add("first");
        orderedList.add("second");
        orderedList.add("third");
        orderedList.add("fourth");
        orderedList.add("fifth");
        System.out.println(orderedList);
    }
}
