package importJAVASE.concurrent;

/**
 * @author cl
 * @version $Id: SynchronizedDemo v 0.1 2019-02-13 11:09 cl Exp $$
 */
public class SynchronizedDemo {

    public static synchronized void staticMethod() throws InterruptedException {
        System.out.println("静态同步方法开始");
        Thread.sleep(1000);
        System.out.println("静态同步方法结束");
    }

    public synchronized void method() throws InterruptedException {
        System.out.println("实例同步方法开始");
        Thread.sleep(1000);
        System.out.println("实例同步方法结束");
    }

    public void method2() throws InterruptedException {
        synchronized (this) {
            System.out.println("实例同步方法2开始");
            Thread.sleep(3000);
            System.out.println("实例同步方法2结束");
        }
    }

    public static void main(String[] args) {
        final SynchronizedDemo synDemo = new SynchronizedDemo();
        Thread thread1 = new Thread(() -> {
            try {
                synDemo.method();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                synDemo.method2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.start();
        thread2.start();
    }
}
