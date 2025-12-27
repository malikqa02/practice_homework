package practice_homework7.task2;

public class Main {
    static Runnable r1 = new Runnable() {
        @Override
        public void run() {
            System.out.println("Hello from anonymous class!");
        }
    };

    public static void main(String[] args) {
        r1.run();
    }
}
