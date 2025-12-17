package practice_homework4.zoo;

public class Elephant extends Animal {
    public Elephant(int age, String name) {
        super(age, name);
    }

    @Override
    public void makeSound() {
        System.out.println("trumpets");
    }

    @Override
    public void move() {
        System.out.println("walks");
    }
}
