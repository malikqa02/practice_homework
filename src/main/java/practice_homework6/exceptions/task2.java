package practice_homework6.exceptions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e){
            System.out.println("ошибка деления на ноль");
        }
    }
}
