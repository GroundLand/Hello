package importJAVASE.time;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
public class BasicTimer {
    static class DelayTask extends TimerTask{

        @Override
        public void run(){
            System.out.println("delayed task");
        }
    }



    public static void main(String[] args){
        Timer timer = new Timer();
        timer.schedule(new DelayTask(),10,1000);

    }
}
