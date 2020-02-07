package importJAVASE.concurrent.AQS;

import java.util.concurrent.CountDownLatch;

/**
 * @author cl
 * @version $Id: TestHarness v 0.1 2019-03-14 14:52 cl Exp $$
 */
public class TestHarness {

    private long timeTasks(int nThreads) throws InterruptedException {
        final CountDownLatch startGate = new CountDownLatch(5);
        final CountDownLatch endGate = new CountDownLatch(nThreads);

        for (int i = 0; i < nThreads; i++) {

            new Thread(new AThread(startGate,endGate)).start();
        }

        long startTime = System.nanoTime();
        doSomething("sart bbb");

        startGate.countDown();
        doSomething("end bbb");
        endGate.await();

        long endTime = System.nanoTime();

        return endTime - startTime;

    }

    private void doSomething(String str){
        int  i = 0;
        while (i <5000 ) i++;
        System.out.println("22222----"+str);
    }

    public static void main(String[] args) {


        TestHarness obj = new TestHarness();
        long gapTime=0;
        try {
            gapTime = obj.timeTasks(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(gapTime);

    }
}

class AThread implements Runnable{

    private final CountDownLatch stateGate;
    private final CountDownLatch endGate;

    AThread(CountDownLatch stateGate,CountDownLatch endGate){
        this.stateGate=stateGate;
        this.endGate=endGate;
    }

    @Override
    public void run() {

        try {
            stateGate.await();
            doWork();
            endGate.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    void doWork(){
        System.out.println(Thread.currentThread().getName()+" is doWorking");
    }
}
