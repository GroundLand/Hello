package importJAVASE.Thread.share;

public abstract class IntGenerator {
    private volatile boolean cancled = false;

    public abstract int next();

    //Allow this to be cancled;
    public void cancel() {
        cancled = true;
    }

    public boolean isCancled() {
        return cancled;
    }
}
