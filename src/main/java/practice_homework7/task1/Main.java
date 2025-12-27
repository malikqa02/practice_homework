package practice_homework7.task1;

import practice_homework7.task1.MathOperation;

public class Main {
    public static void main(String[] args) {
        MathOperation add = (a,b) -> a + b;
        MathOperation subtract = (a,b) -> a - b;
        MathOperation multiply = (a,b) -> a * b;
        MathOperation divide = (a,b) -> a / b;
        System.out.println(add.apply(1,2));
        System.out.println(subtract.apply(3,1));
        System.out.println(multiply.apply(1,2));
        System.out.println(divide.apply(10,2));
    }
}
