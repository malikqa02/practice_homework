package practice8.practiceVideoGenerics;

public class Box<T> {
    public T value;

    public Box(T value) {
        this.value = value;
    }

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return this.value;
    }
}