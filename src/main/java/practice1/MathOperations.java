package practice1;

public class MathOperations {
    public static void main(String[] args){
        int add1 = add(1, 2);
        System.out.println(add1);
        int subtract1 = subtract(3, 2);
        System.out.println(subtract1);
        int multiply1 = multiply(4, 2);
        System.out.println(multiply1);
        double divide1 = divide(5, 2);
        System.out.println(divide1);
        int findMax1 = findMax(42, 21);
        System.out.println(findMax1);
        int difference1 = difference(100, 1000);
        System.out.println(difference1);
        int area1 = squareArea(4);
        System.out.println(area1);
        int perimeter1 = squarePerimeter(5);
        System.out.println(perimeter1);
        double convertSecondsToMinutes1 = convertSecondsToMinutes(150);
        System.out.println(convertSecondsToMinutes1);
        double averageSpeed1 = averageSpeed(1001, 5);
        System.out.println(averageSpeed1);
        double findHypotenuse1 = findHypotenuse(3, 4);
        System.out.println(findHypotenuse1);
        double circleCircumference1 = circleCircumference(3);
        System.out.println(circleCircumference1);
        double percentage1 = percentage(33, 100);
        System.out.println(percentage1);
        double celsiusToFahrenheit1 = celsiusToFahrenheit(35);
        System.out.println(celsiusToFahrenheit1);
        double fahrenheitToCelsius1 = fahrenheitToCelsius(135);
        System.out.println(fahrenheitToCelsius1);
    }
    public static int add(int x, int y){ //сумма
        return x + y;
    }
    public static int subtract(int x, int y){ //разница
        return x - y;
    }
    public static int multiply(int x, int y){ //умножение
        return x * y;
    }
    public static double divide(int x, int y){ //деление
        return (double) x / y;
    }
    public static int findMax(int x, int y){ //макс значение
        return Math.max(x, y);
    }
    public static int difference(int x, int y){ //разница
        return Math.abs(x - y);
    }
    public static int squareArea(int side){ //площадь квадрата
        return side * side;
    }
    public static int squarePerimeter(int side){ //периметр квадрата
        return side * 4;
    }
    public static double convertSecondsToMinutes(int seconds) { //из секунд в минуты
        return (double) seconds / 60;
    }
    public static double averageSpeed(double distance, double time) { //средняя скорость
        return distance / time;
    }
    public static double findHypotenuse(double x, double y) { //гипотенуза
        return Math.sqrt(x * x + y * y);
    }
    public static double circleCircumference(double radius) { //длина окружности
        return 2 * Math.PI * radius;
    }
    public static double percentage(double part, double total) { //высчитать процент
        return 100 * (part / total);
    }
    public static double celsiusToFahrenheit(double c) { //перевод из цельсия в фаренгейты
        return c * 9 / 5 + 32;
    }
    public static double fahrenheitToCelsius(double f) { //перевод из фаренгейты в цельсия
        return (f - 32) * 5 / 9;
    }

}
