package importJAVASE.Thread.pool;

public class DaemonsSpawn implements Runnable {
    @Override
    public void run() {
        while (true)
            Thread.yield();
    }
}
