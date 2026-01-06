package practice_homework8.task3;

public class Main {
    public static volatile boolean flag = true;
    public static int counter = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            while (flag) {
                counter++;
            }
        });
        t1.start();
        Thread.sleep(2000);
        flag = false;
        t1.join();
        System.out.println(counter);
    }
}
