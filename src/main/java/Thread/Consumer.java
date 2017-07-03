package Thread;

import org.apache.log4j.Logger;

import java.util.Queue;

/**
 * Created by Administrator on 2017/6/26 0026.
 */
public class Consumer extends Thread {
    private static final Logger logger = Logger.getLogger(Consumer.class);
    private final Queue sharedQ;

    public Consumer(Queue sharedQ) {
        super("Consumer"); //更改线程名
        this.sharedQ = sharedQ;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (sharedQ) {
                while (sharedQ.size() == 0) {
                    try {
                        logger.debug("Queue id empty,waiting+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                        sharedQ.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int number = sharedQ.size();
                logger.debug("consuming :" + number);
                sharedQ.notify();

                if (number == 3) {
                    sharedQ.poll();;
                }
            }
        }
    }
}
