package importJAVASE.thread.pool;

import java.util.concurrent.TimeUnit;

/**
 * If a thread is a daemon,then any threads it creates will automatically be daemons,
 * as the following example demonstrates
 */
public class Daemons {
    public static void main(String[] args) throws Exception {
        Thread d = new Thread(new Daemon());
        //如果一个线程是后台线程，则该线程创建的线程都是后台线程(默认，可更改)
        d.setDaemon(true);
        d.start();
        System.out.println("d.isDaemon() = " + d.isDaemon() + ", ");
        TimeUnit.SECONDS.sleep(1);
    }
}
