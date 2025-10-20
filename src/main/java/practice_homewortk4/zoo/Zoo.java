package practice_homewortk4.zoo;

public class Zoo {
    private String name;
    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void addAnimal(Animal animal) {
        this.animal = animal;
    }

    protected void removeAnimal() {
        this.animal = null;
    }

    public void showBehavior() {
        System.out.println("Animal name: " + this.animal.getName());
        System.out.print("Animal sounds: ");
        this.animal.makeSound();
        System.out.print("Animal move: ");
        this.animal.move();
    }
}
