package practice_homework;

public class Circle {
    int radius;
    public Circle(int someRadius){
        this.radius = someRadius;
    }
    int getRadius(){
        return this.radius;
    }
    void setRadius(int newRadius){
        this.radius = newRadius;
    }
    double calculateArea(){
        double area = Math.PI * radius * radius;
        System.out.println("Площадь круга равна = " + area);
        return area;
    }
    double calculateCircumference(){
        double circumference = 2 * Math.PI * radius;
        System.out.println("Окружность круга равна = " + circumference);
        return circumference;
    }

}
