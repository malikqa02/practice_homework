package practice_homework2;

public class MathConstants {
    final static double PI = 3.14159;
    final double E = 2.71828;
    static double calculateCircleArea(double r){
        double d = r * r;
        double circleArea = PI * d;
        return circleArea;
    }
    static double calculateCircumference(double r){
        double circleCircumference = 2 * PI * r;
        return circleCircumference;
    }

}
