package practice_homework5.ArrayDequeTask3;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> elements = new ArrayDeque<>();
        elements.add(1);
        elements.add(2);
        elements.add(7);
        elements.add(3);
        elements.add(98);
        System.out.println(elements.pollLast());
        System.out.println(elements.pollFirst());
    }
}
