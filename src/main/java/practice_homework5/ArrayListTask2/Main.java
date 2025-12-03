package practice_homework5.ArrayListTask2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,6,7,8,9,10));
        list.forEach(
                evenNumbers -> {
                    if (evenNumbers % 2 == 0){
            System.out.println(evenNumbers);
                    }
                }
        );
    }
}
