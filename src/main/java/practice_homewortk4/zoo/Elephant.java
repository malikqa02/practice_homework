package practice_homewortk4.zoo;

public class Elephant extends Animal {
    public Elephant(int age, String name){
        super(age, name);
    }

    @Override
    public String makeSound() {
        return "trumpets";
    }

    @Override
    public String move() {
        return "walks";
    }
}
