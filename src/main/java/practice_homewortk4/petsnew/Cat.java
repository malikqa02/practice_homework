package practice_homewortk4.petsnew;

public class Cat extends Pet implements Playable{
    @Override
    void eat() {
        System.out.println("Кошка ест влажный корм");
    }

    @Override
    public void play() {
        System.out.println("Кошка играет с мышкой");
    }
}
