package practice_homewortk4.zoo;

public abstract class Animal {
    private int age;
    private String name;
    public Animal(int age, String name){
        this.age = age;
        this.name = name;
        Zoo.animalCount++;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    abstract String makeSound();
    abstract String move();

}
