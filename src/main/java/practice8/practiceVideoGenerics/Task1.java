package practice8.practiceVideoGenerics;

import practice8.practiceVideoGenerics.Box;

public class Task1 {
    public static class Box<T> {
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
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(1);
        Box raw1 = intBox;
        raw1.set("hello");
        //Box raw2 = intBox;
        //raw2.set(123);
        //System.out.println(raw1.get());
        //Integer x = intBox.get();


    }
}
