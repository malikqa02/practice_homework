package practice_homework3;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        //System.out.println(factorial());
        //parityNumbers();
        //countdown();
    }
    public static int factorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        int factorial = 1;
        int i = 1;
        while (i <= num){
            factorial = factorial * i;
            i++;
        }
        System.out.print("Факториал числа будет ");
        return factorial;
    }
    public static void parityNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        int i = 1;
        while (i <= num){
            if (i % 2 ==0){
                System.out.println(i + " - четное число");
            }
            i++;
        }
    }
    public static void countdown(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int numb = scanner.nextInt();
        while (numb >= 1){
            System.out.println(numb);
            numb--;
        }
    }
}
