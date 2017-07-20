package importJAVASE.Thread;

import javafx.util.Callback;

/**
 * Created by Administrator on 2017/6/27 0027.
 */
public class JoinTest {
    public static void main(String args[]) throws InterruptedException{
        System.out.println(Thread.currentThread().getName() + " is starting");

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName()+" is startted");
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName()+" is Completed");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        thread.start();
        thread.join();
        System.out.println(Thread.currentThread().getName() + "is Completed");
    }
}
