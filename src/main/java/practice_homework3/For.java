package practice_homework3;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        //numbersDivisibleBy3();
        //System.out.println(sumOfNumbers());
        //multiplicationTable();
        //System.out.println(checkPrime());
        //oneToTen();
    }
    public static void numbersDivisibleBy3(){
        for (int i = 0; i < 101; i++){
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }
    public static int sumOfNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < (n+1); i++){
            sum = sum + i;
        }
        return sum;
    }
    public static void multiplicationTable(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        for (int i = 0; i <= 10; i++){
            System.out.println(n + " * " + i + " = " + i*n);
        }
    }
    public static boolean checkPrime(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= (n - 1); i++){
            if (n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void oneToTen(){
        for (int i = 1; i < 11; i++){
            System.out.println(i);
        }
    }
}
