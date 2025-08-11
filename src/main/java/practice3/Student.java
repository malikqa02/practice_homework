package practice3;

public class Student {
    final static int MAX_YEARS = 11;
    static {
        studentCount = 0;
    }
    public static int studentCount;
    int age;
    String name;
    Student(int someAge, String someName){
        this.age = someAge;
        this.name = someName;
        studentCount ++; //increment - в программировании это увеличение на единицу
    }
    static void printMaxYears(){
        System.out.println(MAX_YEARS);
    }
}
