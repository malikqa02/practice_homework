package practice_homework8.task4;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter1 = new Counter();
        Thread t1 = new Thread(() -> {
           for (int i = 0; i < 1000; i++){
               counter1.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++){
                counter1.increment();
            }
        });
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        System.out.println(counter1.getCounter());
    }
}
