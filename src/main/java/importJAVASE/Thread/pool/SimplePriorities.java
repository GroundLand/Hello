package importJAVASE.Thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 测试设置线程优先级
 * The vast majority of the time, all threads should run at the default priority. Trying to
 * manipulate thread priorities is usually a mistake.
 */

public class SimplePriorities implements Runnable {
    private int countDown = 5;
    private volatile double d;
    private int priority;

    public SimplePriorities(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return Thread.currentThread() + ": " + countDown;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);
        while (true) {
            for (int i = 1; i < 10000; i++) {
                d += (Math.PI + Math.E) / (double) i;
                if (i % 1000 == 0)
                    Thread.yield();
            }
            System.out.println(this);
            //不同的写法
            if (--countDown == 0)
                return;
        }
    }

    /**
     * 多执行几次，并不按优先级执行
     * @param args
     */
    public static void main(String args[]) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++)
            exec.execute(new SimplePriorities(Thread.MAX_PRIORITY));
        exec.execute(new SimplePriorities(Thread.MIN_PRIORITY));
        exec.shutdown();
    }
}
