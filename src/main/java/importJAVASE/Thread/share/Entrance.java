package importJAVASE.Thread.share;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Entrance implements Runnable{
    private static ShareCount count = new ShareCount();
    private static List<Entrance> entrances = new ArrayList<>();
    private int number = 0;

    private final int id;

    //此处设置为volatile是因为while循环
    private static volatile boolean cancled = false;

    public static void cancel(){cancled=true;}

    public Entrance(int id){
        this.id = id;
        entrances.add(this);
    }

    @Override
    public void run() {
        while (!cancled){
            synchronized (this){
                ++number;
                System.out.println(this+" Total:"+count.increment());
            }

            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Stopping "+this);

    }

    public synchronized int getValue(){return number;}

    @Override
    public String toString() {
        return "Entance "+id +": "+getValue();
    }

    public static int getTotalCount(){
        return count.value();
    }

    public static int sumEntrances(){
        int sum =0;
        for (Entrance entrance:entrances)
            sum += entrance.getValue();
        return sum;
    }
}
