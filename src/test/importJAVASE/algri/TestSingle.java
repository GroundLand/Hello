package importJAVASE.algri;

import importJAVASE.algorithms_lintcode.codewars.Line;

import static org.junit.Assert.assertEquals;

public class TestSingle {

    @org.junit.Test
    public void test1(){
        String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
        int n = 1;
        assertEquals("Sheldon", new Line().WhoIsNext(names, n));
    }
}
