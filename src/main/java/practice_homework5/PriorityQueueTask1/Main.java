package practice_homework5.PriorityQueueTask1;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(3);
        queue.add(2);
        System.out.println(queue);
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
