package practice_homework5.ArrayListTask1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list.add(6);
        System.out.println("Все числа: ");
        list.forEach(System.out::println);
    }
}
