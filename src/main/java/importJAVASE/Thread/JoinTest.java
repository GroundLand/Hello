package importJAVASE.Thread;

/**
 * Created by Administrator on 2017/6/27 0027.
 * @Function 测试Thread方法中的join方法作用
 */
public class JoinTest {
    public static void main(String args[]) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " is starting");

        Thread thread = new Thread(
                () -> {
                    try {
                        System.out.println(Thread.currentThread().getName() + " is startted");
                        Thread.sleep(2000);
                        System.out.println(Thread.currentThread().getName() + " is Completed");

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );

        thread.start();
        //等到调用者（线程）终止才往下执行
        thread.join();
        System.out.println(Thread.currentThread().getName() + "is Completed");
    }
}
