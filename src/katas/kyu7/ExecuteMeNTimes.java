package katas.kyu7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class ExecuteMeNTimes {
    public void execute(Runnable action, int nTimes) {
        ExecutorService es = Executors.newCachedThreadPool();
        IntStream.range(0, nTimes).mapToObj(i -> new Thread(action)).forEach(es::execute);
        es.shutdown();
        try {
            es.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
