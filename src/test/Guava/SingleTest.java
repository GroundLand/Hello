package Guava;

import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

import java.util.GregorianCalendar;

/**
 * Created by evel on 2017/8/18.
 */
public class SingleTest {

    @Test
    public void tt() {
        GregorianCalendar gc = new GregorianCalendar();
        StdOut.println(gc.get(GregorianCalendar.AM_PM));

    }
}
