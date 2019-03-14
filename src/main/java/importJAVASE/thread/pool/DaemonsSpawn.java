package importJAVASE.thread.pool;

public class DaemonsSpawn implements Runnable {
    @Override
    public void run() {
        while (true)
            Thread.yield();
    }
}
