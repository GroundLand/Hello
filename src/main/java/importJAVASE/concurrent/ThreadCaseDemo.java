package importJAVASE.concurrent;

/**
 * @author cl
 * @version $Id: ThreadCaseDemo v 0.1 2019-02-20 14:34 cl Exp $$
 */
public class ThreadCaseDemo {
    public static void main(String[] args) {
        Info info = new Info();
        Producer producer = new Producer(info);
        Consumer consumer = new Consumer(info);

        new Thread(producer).start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(consumer).start();

    }
}
