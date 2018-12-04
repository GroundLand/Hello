package importJAVASE.algri;

import importJAVASE.algorithms_lintcode.codewars.Line;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSingle {

    @Test
    public void test1() {
        String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
        int n = 1;
        assertEquals("Leonard", new Line().WhoIsNext(names, n));
    }

    @Test
    public void test2() {
        String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
        int n = 6;
        assertEquals("Sheldon", new Line().WhoIsNext(names, n));
    }

    @Test
    public void test3() throws Exception {

    }
}
