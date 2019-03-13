package importJAVASE.concurrent;

/**
 * @author cl
 * @version $Id: ThreadTest_01 v 0.1 2019-02-20 16:10 cl Exp $$
 */
public class ThreadTest_01 implements Runnable {

    @Override
    public synchronized void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + "run......");
        }
    }

    public static void main(String[] args) {
        ThreadTest_01 obj1 = new ThreadTest_01();
        for (int i = 0; i < 5; i++) {
            new Thread(new ThreadTest_01(), "Thread_" + i).start();
        }
    }
}
