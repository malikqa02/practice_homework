package practice1;

public class HelloWorld {
    //поле
    static int a = 1;
    //метод
    //зеленая стрелка - программа запускается
    //main method - начало программы
    public static void main(String[] args){
        int sum1 = sum(1, 5);
        System.out.println("Результат сложения: " + sum1);
        int mult1 = mult(4, 6);
        System.out.println("Результат умножения: " + mult1);
        int sub = subtraction(4, 1);
        System.out.println("Результат вычитания: " + sub);
        double div = division(4, 2);
        System.out.println("Результат деления: " + div);
    }
    public static int sum(int x, int y) {
        //тело метода
        return x + y;
    }
    public static int mult(int x, int y) {
        int multt = x * y;
        return multt;
    }
    public static int subtraction(int x, int y) {
        int sub = x - y;
        return sub;
    }
    public static double division(int x, int y) {
        double div = (double) x / y;
        return div;
    }

}
