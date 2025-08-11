package practice2;


public class Main {
    public static void main(String[] args) {
        // проверка дефолтного конструктора (по умолчанию)
        Student petya = new Student(21, "Петя");
        Student kolyan = new Student(22, "Колян");
        kolyan.setName("Антон");
        petya.setAge(1111);
        petya.print();
        kolyan.print();
    }
}
