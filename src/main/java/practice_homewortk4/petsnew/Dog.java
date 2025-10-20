package practice_homewortk4.petsnew;

public class Dog extends Pet implements Walkable {
    @Override
    void eat() {
        System.out.println("грызет кость");
    }

    @Override
    public void walk() {
        System.out.println("Собака гуляет");
    }
}
