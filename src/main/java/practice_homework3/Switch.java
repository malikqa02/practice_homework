package practice_homework3;

import java.util.Scanner;
import java.util.Stack;

public class Switch {
    public static void main(String[] args) {
        //System.out.println(dayOfWeek());
        //ticketPrice();
        //System.out.println(gradeConverter());
        //System.out.println(printStatus());
        System.out.print(calculator());
    }
    public static String dayOfWeek(){
        Scanner scanner = new Scanner(System.in);
        String dayName = "";
        System.out.print("Введите число: ");
        int caseNum = scanner.nextInt();
        switch (caseNum){
            case 1:
                dayName = "Понедельник";
                break;
            case 2:
                dayName = "Вторник";
                break;
            case 3:
                dayName = "Среда";
                break;
            case 4:
                dayName = "Четверг";
                break;
            case 5:
                dayName = "Пятница";
                break;
            case 6:
                dayName = "Суббота";
                break;
            case 7:
                dayName = "Воскресенье";
                break;
            default:
                System.out.println("Неправильное число");

        }
        return dayName;
    }
    public static void ticketPrice(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите день: ");
        int day = scanner.nextInt();
        switch (day){
            case 1, 2, 3, 4, 5 -> System.out.println("цена - 300");
            case 6, 7 -> System.out.println("цена - 459");
            default -> System.out.println("Несуществующий день");
        }
    }
    public static String gradeConverter(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите балл: ");
        int grade = scanner.nextInt();
        String convertedGrade = "";
        switch (grade / 10){
            case 9, 10 -> convertedGrade = "A";
            case 8 -> convertedGrade = "B";
            case 7 -> convertedGrade = "C";
            case 6 -> convertedGrade = "D";
            case 5 -> convertedGrade = "F";
            default -> System.out.println("Несуществующая оценка");
        }
        return convertedGrade;
    }
    public static String printStatus(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите команду: ");
        String status = "";
        String statusInput = scanner.nextLine();
        switch (statusInput){
            case "start" -> status = "Программа запущена";
            case "stop" -> status = "Программа остановлена";
            case "restart" -> status = "Программа перезапущена";
            case "status" -> status = "Программа стабильно работает";
        }
        return status;
    }
    public static int calculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввесдите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Ввесдите второе число: ");
        int b = scanner.nextInt();
        scanner.nextLine(); //очистка буфера от знака enter
        int result = 0;
        System.out.print("Введите оператор: ");
        String operator = scanner.nextLine();
        switch (operator){
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "*" -> result = a * b;
            case "/" -> {
                if (b == 0) {
                    System.out.print("Ошибка!");
                    return 0;
                }else {
                    result = a / b;
                }
            }
            default -> System.out.print("Несуществующий оператор");
        }
        System.out.print("= ");
        return result;
    }
}
