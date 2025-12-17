package practice_homework4.farm;

public class Chicken extends Animal {
    @Override
    void makeProduct() {
        System.out.println("Курица несет яйца");
    }

    @Override
    void care() {
        System.out.println("Курица клюет зерно");
    }
}
