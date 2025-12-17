package practice_homework4.pets;

public class Main {
    public static void main(String[] args) {
        Owner Vanya = new Owner();
        Cat Vasiliy = new Cat(1, "Vasya");
        Vanya.takePet(Vasiliy);
        Vanya.feed();
        Vanya.interact();
    }
}
