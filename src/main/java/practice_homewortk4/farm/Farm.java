package practice_homewortk4.farm;

import practice_homewortk4.aquarium.SeaAnimal;

public class Farm {
    private Animal animal;

    protected void addAnimal(Animal animal) {
        this.animal = animal;
        System.out.println("Лог: животное добавлено");
    }

    protected void takeCare() {
        this.animal.care();
    }

    protected void takeProducts() {
        this.animal.makeProduct();
    }
}
