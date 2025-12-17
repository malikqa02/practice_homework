package practice_homework4.farm;

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
