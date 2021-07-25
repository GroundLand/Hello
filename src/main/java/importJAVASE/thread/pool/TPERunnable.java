package importJAVASE.thread.pool;

import java.time.LocalTime;

/**
 * @description: 是
 * @author: cl
 * @date: 2021/07/20 下午9:01
 */
public class TPERunnable implements Runnable{

    private String command;

    public TPERunnable(String command){
        this.command = command;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start. Time = " + LocalTime.now()+ "   "+toString());
        processCommand();
        System.out.println(Thread.currentThread().getName() + " End. Time = " + LocalTime.now()+ "   "+toString());
    }

    private void processCommand() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return this.command;
    }
}
