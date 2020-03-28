package importJAVASE.algri;

import importJAVASE.algorithms_lintcode.codewars.Line;
import importJAVASE.math.Bigtest1;
import org.junit.Test;

import java.math.BigDecimal;

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
        BigDecimal bigDecimal = new BigDecimal(3.0);
        System.out.println(bigDecimal.multiply(new BigDecimal(1.1)));
    }
}
