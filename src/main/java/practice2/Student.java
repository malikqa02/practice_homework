package practice2;

public class Student {
    //поля
    int age;
    String name;
    public Student(int someAge, String someName) {
        this.age = someAge;
        this.name = someName;
    }
    //геттеры
    int getAge() {
        return this.age;
    }
    String getName() {
        return name;
    }
    //сеттеры
    void setAge(int newAge) {
        this.age = newAge;
    }
    void setName(String newName) {
        this.name = newName;
    }
    void print() {
        System.out.println("Имя: " + this.name + " Возраст: " + this.age);
    }
}
