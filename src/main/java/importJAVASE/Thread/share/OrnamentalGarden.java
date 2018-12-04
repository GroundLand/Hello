package importJAVASE.Thread.share;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class OrnamentalGarden {
    public static void main(String argsp[]) throws Exception {
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++)
            service.execute(new Entrance(i));
        TimeUnit.SECONDS.sleep(3);
        Entrance.cancel();
        service.shutdown();
        if (!service.awaitTermination(250, TimeUnit.MILLISECONDS))
            System.out.println("Some task2 were not terminated!");
        System.out.println("Total: " + Entrance.getTotalCount());
        System.out.println("Sum of Entrances: " + Entrance.sumEntrances());
    }
}
