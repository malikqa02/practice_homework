package practice_homewortk4.pets;

public class Dog extends Pet {
    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    void eat() {
        System.out.println("dry food");
    }

    @Override
    void action() {
        System.out.println("walks");
    }
}
