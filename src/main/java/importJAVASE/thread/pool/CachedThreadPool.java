package importJAVASE.thread.pool;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ExcutorServie : newFixedThreadPool(int poolSize),
 *                 newSingleThreadExecutor(),
 *                 newCachedThreadPool()
 */
public class CachedThreadPool {
    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        // Future future = null;
        for (int i = 0; i < 5; i++)
            exec.submit(new LiftOff());
        exec.shutdown();
        System.out.println(exec.isShutdown());


    }
}
