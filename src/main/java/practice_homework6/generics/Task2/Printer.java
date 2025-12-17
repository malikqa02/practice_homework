package practice_homework6.generics.Task2;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Printer {
    public <T> void printArray(T[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
