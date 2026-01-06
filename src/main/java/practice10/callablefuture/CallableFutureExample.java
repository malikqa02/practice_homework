package practice10.callablefuture;
import java.util.Random;
import java.util.concurrent.*;

public class CallableFutureExample {
    // Сложные расчеты ДНК
    // Наша задача - дождаться вычисления и получить результат

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        // тут мы создаем Callable dnaResult, который описывает таску
        Callable<Integer> dnaResult = () -> {
            System.out.println("Сложное вычисление DNA");
            Thread.sleep(10000);
            int randomDnaResult = new Random().nextInt();
            return randomDnaResult;
        };
        //теперь мы создаем переменную future типа Future и говорим нашему executorService, чтобы он выставил на исполнение нашу таску и дождался ее
        //то есть чтобы он добавил ее в свой пул и когда вычислится - вернул
        Future<Integer> future = executorService.submit(dnaResult);

        System.out.println("Результат DNA: " + future.get());

        executorService.shutdown(); // завершить работу с пулом
    }
}