package practice_homework6.generics.Task1;


public class Main {
    public static void main(String[] args) {
        Box intBox = new Box<>(12);
        System.out.println(intBox.getValue());
        Box stringBox = new Box<>("строка");
        System.out.println(stringBox.getValue());
    }
}
