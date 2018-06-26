package importJAVASE.Thread.pool;

import java.util.concurrent.ThreadFactory;

public class DaemonThreadFactory implements ThreadFactory{
    @Override
    public Thread newThread(Runnable runnable) {
        Thread t = new Thread(runnable);
        //设置为后台进程
        t.setDaemon(true);
        return t;
    }
}
