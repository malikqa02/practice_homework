package practice8.generics;

public class Box <T> {
    public T t;

    public Box(T t) {
        this.t = t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return this.t;
    }

    @Override
    public String toString() {
        return (String) t;
    }
}
