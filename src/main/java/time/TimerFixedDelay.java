package time;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
public class TimerFixedDelay {
    static class LongRunningTask extends TimerTask{

        public void run() {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("LongRunning......");
                System.exit(0);
        }
    }

    static class FixedDelayTask extends TimerTask{

        public void run() {
            System.out.println(System.currentTimeMillis());
        }
    }

    public static void main(String[] args){
        Timer timer = new Timer();
        timer.schedule(new LongRunningTask(),10);
        timer.scheduleAtFixedRate(new FixedDelayTask(),10,1000);

    }
}
