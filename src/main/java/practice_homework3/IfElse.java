package practice_homework3;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        //System.out.print(signOfNumber());
        //System.out.println(findMaxOfTwoNumbers());
        //System.out.println(grade());
        //System.out.print(checkParity());
        //System.out.print(discount());
        //System.out.println(testResult());

    }
    public static String signOfNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        String sign = "";
        if (number > 0){
            sign = "Положительное число";
        }
        else if (number < 0){
            sign = "Отрицательное число";
        } else {
            sign = "Число равно нулю";
        }
        return sign;
    }
    public static int findMaxOfTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        int maxNum = num1;
        if (num2 > num1) {
            maxNum = num2;
        }
        System.out.print("Максимальное число: ");
        return maxNum;
    }
    public static String grade(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите оценку: ");
        int a = scanner.nextInt();
        String grade = "";
        if (a == 5){
            grade = "Отлично";
        }
        if (a == 4){
            grade = "Хорошо";
        }
        if (a == 3){
            grade = "Удовлетворительно";
        }
        if (a == 2 || a == 1){
            grade = "Неудовлетворительно";
        }
        return grade;
    }
    public static String checkParity(){
        Scanner scanner = new Scanner(System.in);
        String parity = "Нечетное";
        System.out.print("Введите число");
        int number = scanner.nextInt();
        if (number % 2 == 0){
            parity = "Четное";
        }
        return parity;
    }
    public static int discount(){
        Scanner scanner = new Scanner(System.in);
        int discount;
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        if (age < 18){
            discount = 25;
        } else if (age >= 65) {
            discount = 30;
        } else {
            discount = 0;
        }
        return discount;
    }
    public static String testResult(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваш балл?");
        int grade = scanner.nextInt();
        String result = "";
        if (grade >= 90){
            result = "Отлично";
        } else if (grade >= 75 && grade <= 89) {
            result = "Хорошо";
        } else if (grade >= 60 && grade <= 74) {
            result = "Удовлетворительно";
        } else {
            result = "Неудовлетворительно";
        }
        return result;
    }




}
