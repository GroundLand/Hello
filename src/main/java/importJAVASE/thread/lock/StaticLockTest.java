package importJAVASE.thread.lock;

/**
 * @description: 测试synchronized加在静态方法和非静态方法上的区别
 * @author: cl
 * @date: 2021/07/17 下午9:08
 */
public class StaticLockTest extends Thread {

    static StaticLockTest test1 = new StaticLockTest();
    static StaticLockTest test2 = new StaticLockTest();




    @Override
    public void run() {
       // noStaticMethod();
        staticMethod();
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(test1,"Thread 111");
        Thread thread2 = new Thread(test2,"Thread 222");
        thread1.start();
        thread2.start();
    }


    public static synchronized void staticMethod(){
        System.out.println("staticMethod : " + Thread.currentThread().getName()+"started");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("staticMethod : "+Thread.currentThread().getName()+"is over");
    }

    public synchronized void noStaticMethod(){
        System.out.println("noStaticMethod:  "+Thread.currentThread().getName()+"started");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("noStaticMethod: "+Thread.currentThread().getName()+"is over");
    }
}
