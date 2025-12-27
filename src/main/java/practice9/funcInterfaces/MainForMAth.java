package practice9.funcInterfaces;

public class MainForMAth {
    public static void main(String[] args) {
        MathOperations add = (x, y) -> x + y;
        MathOperations subtract = (x, y) -> x - y;
        MathOperations multiply = (x, y) -> x * y;
        MathOperations divide = (x, y) -> x / y;
        System.out.println(add.apply1(1, 2));
        System.out.println(divide.apply1(4, 2));
        System.out.println(subtract.apply1(4, 1));
        System.out.println(multiply.apply1(4, 2));
    }
}
