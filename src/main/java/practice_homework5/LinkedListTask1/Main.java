package practice_homework5.LinkedListTask1;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.forEach(
                list1 -> {
                    System.out.println(list1);
                }
        );
    }
}
