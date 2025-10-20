package practice_homewortk4.pets;

public class Cat extends Pet {
    public Cat(int age, String name) {
        super(age, name);
    }

    @Override
    void eat() {
        System.out.println("wet food");
    }

    @Override
    void action() {
        System.out.println("plays");
    }
}
