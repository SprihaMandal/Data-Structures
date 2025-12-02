
package threading.topic4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) throws Exception {

        Runnable r = () -> {
            System.out.println("Hello world");
        };

        Thread t = new Thread(r);
        t.start();

        Callable<Integer> c = () -> {
            Thread.sleep(0);
            return 1 + 3;
        };

        ExecutorService executor = Executors.newFixedThreadPool(3);

        Future<Integer> f = executor.submit(c);
        executor.execute(r);
        System.out.println(f.get());
        executor.shutdown();

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        ScheduledFuture<?> future = scheduler.scheduleAtFixedRate(() -> {
            System.out.println("Running job...");
        }, 0, 2, TimeUnit.SECONDS);

        // Cancel the job after 10 seconds
        scheduler.schedule(() -> {
            System.out.println("Cancelling the repeating task...");
            future.cancel(true); // true = interrupt if running
        }, 10, TimeUnit.SECONDS);

    }

}