package importJAVASE.Thread;

/**
 * Created by evel on 2017/8/4.
 */
/*
 * 卖票
 * 1.开放的窗口
 * 2.票数
 * 3.根据不同终点 的卖票
 */

public class Test {

    public static void main(String[] args) {

        Runnableclass_3 t = new Runnableclass_3("2222");

        //Thread 定义的对象是窗口
        Thread thread1 = new Thread(t);
        Thread thread2 = new Thread(t);
        Thread thread3 = new Thread(t);
        Thread thread4 = new Thread(t);
        Thread thread5 = new Thread(t);
        Thread thread6 = new Thread(t);
        Thread thread7 = new Thread(t);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();

    }
}

//优化后的程序

class Runnableclass_3 implements Runnable {
    private int tick1 = 50;

    private String string;

    public Runnableclass_3(String string) {
        this.string = string;
    }

    @Override
    public void run() {

        while (tick1 > 0) {

            System.out.println(Thread.currentThread().getName() + "  起点  怀化   终点   " + string + "   卖出   " + tick1-- + " 票");

        }

    }

}
