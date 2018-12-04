package importJAVASE.Thread.exception;

import edu.princeton.cs.algs4.StdOut;

public class ExceptionThread implements Runnable {
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        StdOut.println("run() by" + t);
        StdOut.println("eh = " + t.getUncaughtExceptionHandler());
        throw new RuntimeException();
    }
}
