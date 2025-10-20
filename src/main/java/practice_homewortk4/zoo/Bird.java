package practice_homewortk4.zoo;

public class Bird extends Animal {
    public Bird(int age, String name) {
        super(age, name);
    }

    @Override
    public void makeSound() {
        System.out.println("tweets");
    }

    @Override
    public void move() {
        System.out.println("fly");
    }
}
