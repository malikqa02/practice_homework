package practice_homework5.LinkedListTask2;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("task 1");
        list.add("task 2");
        list.add("task 3");
        while (list.isEmpty() == false){
            System.out.println(list.poll());
        }
    }
}