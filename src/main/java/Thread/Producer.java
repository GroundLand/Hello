package Thread;


import org.apache.log4j.Logger;

import java.util.Queue;

/**
 * Created by Administrator on 2017/6/26 0026.
 */
public class Producer extends Thread {
    private static final Logger logger = Logger.getLogger(Producer.class);
    private final Queue sharedQ;

    public Producer(Queue sharedQ) {
        super("Producer");
        this.sharedQ = sharedQ;
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            synchronized (sharedQ) {
                while (sharedQ.size() >= 1) {
                    try {
                        logger.debug("Queue is full,waiting");
                        sharedQ.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                logger.debug("producing"+i);
                sharedQ.add(i);
                sharedQ.notify();
            }
        }
    }

}
