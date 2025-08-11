package practice_homework;

public class Main {
    public static void main(String[] args) {
        //car
        Car benz = new Car("Mercedes-Benz", 2025);
        benz.setYear(2000);
        benz.print();
        //rectangle
        Rectangle first = new Rectangle(10, 2);
        first.calculateArea();
        first.setWidth(5);
        first.calculateArea();
        //book
        Book onebook = new Book("Шантарам", "А.А.А.");
        onebook.setAuthor("M. M. M.");
        onebook.printInfo();
        //bank account
        BankAccount malik = new BankAccount(0, "A.A.R.");
        malik.deposit(1000);
        malik.withdraw(660);
        malik.printBalance();
        //point
        Point msc = new Point(11.22F, 33.44F);
        msc.setX(55.66F);
        msc.print();
        //student group
        StudentGroup f1 = new StudentGroup("Math", 120);
        f1.setStudentCount(100);
        f1.printInfo();
        //circle
        Circle newCircle = new Circle(12);
        newCircle.setRadius(10);
        newCircle.calculateArea();
        newCircle.calculateCircumference();
        //teacher
        Teacher mathTeacher = new Teacher("Мариванна", "геометрия");
        mathTeacher.setSubject("математика");
        mathTeacher.printInfo();
        //product
        Product bread = new Product("хлеб", 200);
        bread.applyDiscount(50);
        bread.printInfo();
        Product milk = new Product("молоко", 230);
        milk.printInfo();
        bread.printInfo();
        //laptop
        Laptop macbook = new Laptop("Apple MacBook", 100000);
        macbook.setPrice(120000);
        macbook.printInfo();
    }
}
