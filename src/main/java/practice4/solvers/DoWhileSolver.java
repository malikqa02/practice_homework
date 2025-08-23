package practice4.solvers;

import java.util.Random;
import java.util.Scanner;

public class DoWhileSolver {
    public static void main(String[] args) {
        //findNumber(5);
        //System.out.println(findMinimum());
        checkCredentials();
    }
    public static void findNumber(int bound){
        Scanner scanner = new Scanner(System.in);
        int random = new Random().nextInt(bound);
        int number;
        do {
            System.out.print("Введи число: ");
            number = scanner.nextInt();
        } while (number != random);
        System.out.println("Вы угадали");
    }
    public static int findMinimum(){
        Scanner scanner = new Scanner(System.in);
        int number;
        int min = 2147483647;
        do {
            System.out.print("Введите число: ");
            number = scanner.nextInt();
            if (number < min && number >= 0) {
                min = number;
            }
        } while (number >= 0);
        return min;
    }
    public static void checkCredentials(){
        String login;
        String password;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Логин: ");
            login = scanner.nextLine();
            System.out.print("Пароль: ");
            password = scanner.nextLine();
        } while (!login.equals("admin") || !password.equals("123"));
        System.out.println("Доступ разрешен");
    }
}
