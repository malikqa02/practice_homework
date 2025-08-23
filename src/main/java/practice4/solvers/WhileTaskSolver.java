package practice4.solvers;

import java.util.Scanner;

public class WhileTaskSolver {
    public static void main(String[] args) {
        printNumberBefore10();
        //commandReader();
        System.out.println(sumOfDigits(12113));
    }
    public static void printNumberBefore10() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
    public static void commandReader(){
        Scanner scanner = new Scanner(System.in);
        String command = "";
        while (!command.equals("exit")){
            System.out.print("Введите комманду: ");
            command = scanner.nextLine();
        }
        System.out.print("Программа завершена");
    }
    public static int sumOfDigits(int number){
        int sum = 0;
        while (number > 0){
            sum = sum + number % 10;
            number = number / 10;

        }
        return sum;
    }
}
