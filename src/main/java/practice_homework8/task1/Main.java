package practice_homework8.task1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++){
                    System.out.println("Привет из потока!");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t1.join();
    }
}
