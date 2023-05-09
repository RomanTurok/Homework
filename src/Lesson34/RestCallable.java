package Lesson34;

import java.util.Random;
import java.util.concurrent.Callable;

public class RestCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        int number = new Random().nextInt(50);
        return Thread.currentThread().getName() + " : " + number;
    }
}
