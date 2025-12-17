package practice_homework6.generics.Task3;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "first");
        System.out.println(pair.value);
        System.out.println(pair.value2);
    }
}
