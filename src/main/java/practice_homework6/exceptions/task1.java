package practice_homework6.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class task1 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("example.txt"));

        } catch (IOException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        }
    }
}
