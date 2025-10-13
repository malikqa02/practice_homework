package practice_homewortk4.zoo;

public class Bird extends Animal {
    public Bird (int age, String name) {
        super(age, name);
    }
    @Override
    String makeSound(){
        return "tweets";
    }
    @Override
    String move(){
        return "fly";
    }
}
