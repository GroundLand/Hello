package importJAVASE.Thread.pool;

import java.util.concurrent.TimeUnit;

public class SimpleDaemons implements Runnable {

    @Override
    public void run() {
        try {
            while (true) {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            }
        } catch (InterruptedException e) {
            System.out.print("interrupt");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread daemon = new Thread(new SimpleDaemons());
            //设置为后台线程
            daemon.setDaemon(true);
            daemon.start();
        }

        System.out.println("All daemons started");
        TimeUnit.MILLISECONDS.sleep(100);
    }
}
