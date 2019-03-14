package importJAVASE.thread;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2017/6/26 0026.
 */
public class ConProTest {
    public static void main(String[] args) {
        final Queue queue = new LinkedList();

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        producer.start();
        consumer.start();

    }
}
