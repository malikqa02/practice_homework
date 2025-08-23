package practice_homework3;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        //System.out.print(sum());
        //oneToTwenty();
        //printPositiveNum();
        command();
    }
    public static int sum() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num = 1;
        while (num > 0) {
            System.out.print("Введите число: ");
            num = scanner.nextInt();
            if (num < 0) {
                break;
            } else {
                sum += num;
            }
        }
        return sum;
    }
    public static void oneToTwenty(){
        for (int i = 1; i <= 20; i++){
            if (i % 3 == 0){
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
    public static void printPositiveNum(){
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int num = 0;
        while (a == 0){
            num = scanner.nextInt();
            if (num > 0){
                System.out.println(num);
            } else {
                continue;
            }
        }
    }
    public static void command(){
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        String command = "";
        while (a == 0){
            System.out.print("Введите команду: ");
            command = scanner.nextLine();
            if (command.equals("STOP")){
                System.out.println("Команда стоп");
                break;
            } else {
                System.out.println("Команда - " + command);
            }
        }
    }
}
