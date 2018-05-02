package importJAVASE.Thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        LiftOff liftOff=new LiftOff();
        Future future=exec.submit(liftOff);
        System.out.println(exec.isShutdown());

        exec.shutdown();
        future.cancel(false);System.out.println(exec.isShutdown());

    }
}
