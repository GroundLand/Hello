package importJAVASE.time;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
public class ScheduledFixedDelay {
    static class LongRunTasrk implements Runnable{

        public void run() {
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println("星期二");
        }
    }

    static class FixedDelayTask implements Runnable{

        public void run() {
            System.out.println(System.currentTimeMillis());
            throw new RuntimeException();
        }
    }

    public static void main(String[] args){
        ScheduledExecutorService timer = Executors.newScheduledThreadPool(10);
        timer.schedule(new LongRunTasrk(), 10, TimeUnit.MILLISECONDS);
        timer.scheduleWithFixedDelay(new FixedDelayTask(), 100, 1000,
                TimeUnit.MILLISECONDS);
    }
}
