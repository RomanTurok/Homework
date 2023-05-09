package Lesson34;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Callable<String >> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new RestCallable());
        }

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<Future<String>> futures = executorService.invokeAll(list);
        System.out.println("Start");
        for (Future<String> future : futures){
            System.out.println(future.get());
        }
        System.out.println("End");

    }
}
