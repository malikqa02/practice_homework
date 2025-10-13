package practice_homewortk4.zoo;

public class Zoo {
    private String name;
    protected static int animalCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnimalCount(int animalCount) {
        this.animalCount = animalCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }
    protected void addAnimal(int newAnimalCount){
        animalCount++;
    }
    public void showBehavior(Animal animal){
        System.out.println("Animal name: " + animal.getName() + ", Animal sounds: " + animal.makeSound() + ", Animal move: " + animal.move());
    }
}
