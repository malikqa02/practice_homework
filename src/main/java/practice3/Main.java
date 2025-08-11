package practice3;

import static java.lang.System.out;

import practice_homework.Car;
import practice_homework.Laptop;

public class Main {
    public static void main(String[] args) {
        //создали переменную
        //присвоили переменной экхемпляр класса Студент
        // вызвав дефолтный конструктор
        System.out.println(Student.studentCount);
        Student petya = new Student(12, "p");
        System.out.println(Student.studentCount);
        Student kolya = new Student(11, "k");
        System.out.println(Student.studentCount);
        Student.printMaxYears();
    }
}
