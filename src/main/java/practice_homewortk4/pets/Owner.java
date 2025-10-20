package practice_homewortk4.pets;

public class Owner {
    private Pet pet;
    private String name;
    private int age;

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    protected void takePet(Pet pet) {
        this.pet = pet;
    }

    protected void removePet() {
        this.pet = null;
    }

    protected void interact() {
        this.pet.action();
    }

    protected void feed() {
        this.pet.eat();
    }
}
