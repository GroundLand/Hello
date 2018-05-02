package importJAVASE.proxy;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by evel on 2018/2/23.
 */
public class CalculatorImpl implements Calculate {
    @Override
    public void doSomething() {
        StdOut.println("SimpleProxy somethineWlse ");
    }

    @Override
    public void somethingElse(String arg) {
        StdOut.println("SimpleProxy "+ arg);
    }
}
