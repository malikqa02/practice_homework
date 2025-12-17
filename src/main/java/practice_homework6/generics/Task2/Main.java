package practice_homework6.generics.Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arrayInt = {1,2,4};
        String[] arrayString = {"first","second","third"};
        Printer printer = new Printer();
        printer.printArray(arrayInt);
        printer.printArray(arrayString);
    }
}
