package practice_homewortk4.farm;

public class Cow extends Animal {

    @Override
    void makeProduct() {
        System.out.println("Корова дает молоко");
    }

    @Override
    void care() {
        System.out.println("Корова на выпасе");
    }
}
