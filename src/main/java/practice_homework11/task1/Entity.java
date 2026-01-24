package practice_homework11.task1;

public abstract class Entity {
    private final String name;
    private int age;
    private boolean isActive;

    public Entity(String name, boolean isActive, int age) {
        this.name = name;
        this.isActive = isActive;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return isActive;
    }

    public int getAge() {
        return age;
    }
}
