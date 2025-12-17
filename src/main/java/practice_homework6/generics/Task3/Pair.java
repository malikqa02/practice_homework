package practice_homework6.generics.Task3;

public class Pair<T,U> {
    public T value;
    public U value2;

    public Pair(T value, U value2) {
        this.value = value;
        this.value2 = value2;
    }

    public T getValue() {
        return value;
    }
    public U getValue2() {
        return value2;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public void setValue2(U value2) {
        this.value2 = value2;
    }
}