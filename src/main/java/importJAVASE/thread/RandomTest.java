package importJAVASE.thread;

/**
 * Created by evel on 2018/2/26.
 */
public class RandomTest {

    Object object = new Object();
    public void method() {
        synchronized (object) {
            System.out.println("synchronized 代码块");
        }
    }
}
