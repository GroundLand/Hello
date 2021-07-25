package importJAVASE.thread.lock;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class SynchronizedStringTest {

    private static int CNT=0;

    public static void main(String[] args) {
        String lock = "344";
        final Integer threadNum = 10;
        final CyclicBarrier cb = new CyclicBarrier(threadNum, new Runnable() {

            public void run() {
                System.out.println("threadNum : " + threadNum);
            }
        });

        for(int i = 0; i< threadNum; i++) {
            String tmpLock = new String(lock);
            new TestThread(cb, tmpLock).start();
        }
    }

    static class TestThread extends Thread{

        private  CyclicBarrier cb;

        private  String templock;

        public TestThread(CyclicBarrier cb,String templock){
            this.cb = cb;
            this.templock=templock;
        }

        @Override
        public void run() {

            try {
                cb.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized(templock.intern()) { //这里直接使用String对象本身作为锁
                CNT = CNT+1;
                System.out.println("Value:" + CNT);
            }


        }
    }

}
