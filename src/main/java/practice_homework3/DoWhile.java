package practice_homework3;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        //positiveNumber();
        //checkCredentials();
        //commandExit();
        System.out.print(countDigits());
    }
    public static void positiveNumber(){
        Scanner scanner = new Scanner(System.in);
        int num;
        do{
            System.out.print("Введите число: ");
            num = scanner.nextInt();
        }while (num < 0);
        System.out.println("Положительное число");
    }
    public static void checkCredentials(){
        Scanner scanner = new Scanner(System.in);
        String password = "qwerty";
        String inputPassword;
        do {
            System.out.print("Введите пароль: ");
            inputPassword = scanner.nextLine();
        } while (!inputPassword.equals(password));
        System.out.println("Вы авторизировались");
    }
    public static void commandExit(){
        Scanner scanner = new Scanner(System.in);
        String inputCommand;
        do {
            System.out.print("Введите команду: ");
            inputCommand = scanner.nextLine();
        } while (!inputCommand.equals("exit"));
        System.out.print("Вы вышли");
    }
    public static int countDigits(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        int count = 0;
        int a = 0;
        if (num != 0) {
            do {
                a = num % 10;
                count = count + a;
                num = num / 10;
            } while (a != 0);
        } else {
            System.out.print("Число - ");
        }
        return count;
    }
}
