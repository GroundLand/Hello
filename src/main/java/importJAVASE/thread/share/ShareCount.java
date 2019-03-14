package importJAVASE.thread.share;

import java.util.Random;

public class ShareCount {
    private int count = 0;
    private Random random = new Random(47);

    /**
     * 用多余的temp变量，原因++不是原子操作，可能程序终端
     * @return
     */
    public synchronized int increment() {
        int temp = count;
        //几率一半，true或者false
        if (random.nextBoolean())
            Thread.yield();
        return (count = ++temp);
    }

    public synchronized int value() {
        return count;
    }

    ;
}
