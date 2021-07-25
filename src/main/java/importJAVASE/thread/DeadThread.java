package importJAVASE.thread;

public class DeadThread {

    private static String source1="23";

    private static String source2="34";

    public static void main(String[] args) {

        new Thread(()->{

            synchronized (source1){
                System.out.println(Thread.currentThread() + "get resource1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "waiting get resource2");
                synchronized (source2) {
                    System.out.println(Thread.currentThread() + "get resource2");
                }
            }

        },"线程1").start();

        new Thread(()->{

            synchronized (source1){
                System.out.println(Thread.currentThread() + "get resource1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "waiting get resource2");
                synchronized (source2) {
                    System.out.println(Thread.currentThread() + "get resource2");
                }
            }

        },"线程2").start();

    }
}
