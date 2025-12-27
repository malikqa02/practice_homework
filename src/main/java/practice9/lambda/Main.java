package practice9.lambda;

public class Main {
    public static void main(String[] args) {
        // анонимный класс
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("привет мир");
            }
        };
        r1.run();
        // как сделать то же самое но с лямбдой
        Runnable r2 = () -> System.out.println("привет мир!");
        r2.run();
    }
}
