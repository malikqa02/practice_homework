package practice8.generics;

public class Main {
    public static void main(String[] args) {
        Box<String> boxString = new Box<>("12");
        boxString.setT("Яблоко");
        System.out.println(boxString.getT());
        Box<Integer> boxInteger = new Box<>(1);
        boxInteger.setT(12);
        System.out.println(boxInteger.getT());
        Box<Book> boxOfBooks = new Box<>(new Book("нига"));
        System.out.println(boxOfBooks.getT());
    }
}
