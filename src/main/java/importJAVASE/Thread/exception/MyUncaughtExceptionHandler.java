package importJAVASE.Thread.exception;

import edu.princeton.cs.algs4.StdOut;

public class MyUncaughtExceptionHandler implements
        Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        StdOut.println("caught " + e);
    }
}
